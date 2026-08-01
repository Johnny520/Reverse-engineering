package io.ktor.util;

import de.robv.android.xposed.XC_MethodHook;
import java.io.InvalidObjectException;
import java.util.NoSuchElementException;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlinx.serialization.protobuf.internal.ProtobufDecodingException;
import lin.xposed.hook.javaplugin.OnMsgMenuCreateAPI;
import net.bytebuddy.pool.TypePool;
import p010.InterfaceC6159;

/* JADX INFO: renamed from: io.ktor.util.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4210 implements InterfaceC6159 {
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static /* synthetic */ void m8602(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static /* synthetic */ void m8603(Object obj, String str) {
        throw new IllegalStateException((str + obj + '\'').toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static /* synthetic */ void m8604(Object obj, String str) {
        throw new KotlinReflectionInternalError(str + obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static /* synthetic */ void m8605(Object obj, String str) {
        throw new KotlinReflectionInternalError(str + obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static /* synthetic */ void m8606(Object obj, String str) {
        throw new UnsupportedOperationException(str + obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static /* synthetic */ void m8607(Object obj, String str) {
        throw new IllegalStateException(str + obj + ')');
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static /* synthetic */ void m8608(int i, String str) throws InvalidObjectException {
        throw new InvalidObjectException(str + i + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static /* synthetic */ void m8609(int i, Object obj, Throwable th) {
        throw new ProtobufDecodingException("Error while decoding proto number " + i + ((Object) " of ") + obj, th);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static /* synthetic */ void m8610(int i, Object obj, Object obj2, String str) {
        throw new IllegalArgumentException((str + obj + obj2 + i).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static /* synthetic */ void m8611(int i, int i2, String str) {
        throw new IllegalArgumentException((str + i + ((char) i2)).toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static /* synthetic */ void m8612() {
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static /* synthetic */ void m8613(Object obj, StringBuilder sb) {
        sb.append(obj);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static /* synthetic */ void m8614(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static /* synthetic */ void m8615(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static /* synthetic */ void m8616(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException((str + obj + obj2 + obj3 + '\'').toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static /* synthetic */ void m8617(String str, Object obj, Object obj2, Object obj3) {
        throw new KotlinReflectionInternalError(str + obj + obj2 + obj3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static /* synthetic */ void m8618(StringBuilder sb, int i) {
        sb.append(i);
        throw new IllegalStateException(sb.toString().toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static /* synthetic */ void m8619(String str, long j, Object obj) {
        throw new IllegalArgumentException((str + j + obj).toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static /* synthetic */ void m8620(String str, int i, Object obj, int i2, Object obj2) {
        throw new IllegalArgumentException(str + i + obj + i2 + obj2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static /* synthetic */ void m8621() {
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static /* synthetic */ void m8622(int i, String str) {
        throw new IllegalStateException((str + i).toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static /* synthetic */ void m8623(String str, Object obj, Object obj2, Object obj3) {
        throw new KotlinReflectionInternalError(str + obj + obj2 + obj3 + ')');
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static /* synthetic */ void m8624(StringBuilder sb, int i) {
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static /* synthetic */ void m8625(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static /* synthetic */ void m8626(Object obj, int i, int i2) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(obj);
        sb.append(i2);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static /* synthetic */ void m8627(String str) {
        throw new NoSuchElementException(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static /* synthetic */ void m8628(String str, int i, Object obj, int i2) {
        throw new IndexOutOfBoundsException(str + i + obj + i2 + ((Object) ")."));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static /* synthetic */ void m8629(Object obj, String str, Object obj2) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static /* synthetic */ void m8630(Object obj, StringBuilder sb) {
        sb.append(", ");
        sb.append(obj);
        throw new IllegalStateException(sb.toString().toString());
    }

    @Override // p010.InterfaceC6159
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void mo8631(XC_MethodHook.MethodHookParam methodHookParam) {
        OnMsgMenuCreateAPI.lambda$loadHook$0(methodHookParam);
    }
}
