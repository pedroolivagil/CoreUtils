package com.olivadevelop.coreutils.db.provider;

import android.content.Context;

import com.olivadevelop.coreutils.db.IDataBaseFactory;
import com.olivadevelop.coreutils.db.factory.DefaultDataBaseFactory;

public class DataBaseFactoryProvider implements IDataBaseFactoryProvider {
    @Override
    public IDataBaseFactory create(Context context, IDataBaseProvider provider) { return new DefaultDataBaseFactory(context, provider); }
}