// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.kit.notification;

import android.content.DialogInterface;

final class val.editor
    implements android.content.face.OnCancelListener
{

    final android.content.rences.Editor val$editor;

    public final void onCancel(DialogInterface dialoginterface)
    {
        if (val$editor != null)
        {
            val$editor.putBoolean("ARater__DONT_SHOW", true);
            val$editor.commit();
        }
        dialoginterface.dismiss();
    }

    stener()
    {
        val$editor = editor1;
        super();
    }
}
