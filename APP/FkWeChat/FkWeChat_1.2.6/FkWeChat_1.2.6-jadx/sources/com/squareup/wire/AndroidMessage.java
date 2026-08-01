package com.squareup.wire;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.wire.AbstractC1845a;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m16757d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000 \u000f*\u0014\b\u0000\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001*\u0014\b\u0001\u0010\u0004*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00012\u00020\u0005:\u0001\u0010J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011"}, m16758d2 = {"Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/wire/a;", "M", _UrlKt.FRAGMENT_ENCODE_SET, "B", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "dest", _UrlKt.FRAGMENT_ENCODE_SET, "flags", "Ll8/i0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "s", "a", "wire-runtime"}, m16759k = 1, m16760mv = {1, 9, 0}, m16762xi = 48)
public abstract class AndroidMessage<M extends AbstractC1845a, B> extends AbstractC1845a implements Parcelable {
    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeByteArray(m6536a());
    }
}
