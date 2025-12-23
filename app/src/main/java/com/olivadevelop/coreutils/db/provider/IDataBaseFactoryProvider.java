package com.olivadevelop.coreutils.db.provider;

import android.content.Context;

import com.olivadevelop.coreutils.db.IDataBaseFactory;

public interface IDataBaseFactoryProvider {
    IDataBaseFactory create(Context context, IDataBaseProvider provider);
}
