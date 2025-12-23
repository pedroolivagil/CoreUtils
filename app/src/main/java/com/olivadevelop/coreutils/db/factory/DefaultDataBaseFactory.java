package com.olivadevelop.coreutils.db.factory;

import android.content.Context;

import com.olivadevelop.coreutils.db.provider.IDataBaseProvider;

public class DefaultDataBaseFactory extends DataBaseFactory {
    public DefaultDataBaseFactory(Context context, IDataBaseProvider provider) { super(context, provider); }
}
