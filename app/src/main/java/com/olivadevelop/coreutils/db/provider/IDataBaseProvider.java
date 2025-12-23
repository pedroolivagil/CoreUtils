package com.olivadevelop.coreutils.db.provider;

import android.content.Context;

import com.olivadevelop.coreutils.db.IDataBase;

public interface IDataBaseProvider {
    IDataBase provide(Context context);
}
