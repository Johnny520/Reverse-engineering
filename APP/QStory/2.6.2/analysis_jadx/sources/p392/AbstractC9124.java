package p392;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.text.TextUtils;
import android.view.View;
import androidx.compose.ui.graphics.AbstractC1581;
import androidx.compose.ui.graphics.vector.C1543;
import androidx.emoji2.text.flatbuffer.C2301;
import androidx.profileinstaller.AbstractC2442;
import com.android.dx.io.Opcodes;
import com.bumptech.glide.AbstractC3055;
import com.bumptech.glide.AbstractC3056;
import com.davemorrissey.labs.subscaleview.R;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import de.robv.android.xposed.XposedHelpers;
import io.ktor.client.plugins.api.AbstractC3884;
import io.ktor.client.plugins.api.C3885;
import io.ktor.util.C4210;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UTFDataFormatException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.AbstractC5186;
import kotlin.collections.AbstractC4343;
import kotlin.jvm.internal.AbstractC4393;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.C4396;
import kotlin.reflect.AbstractC5089;
import kotlin.reflect.C5084;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.internal.AbstractC5066;
import kotlin.reflect.jvm.internal.C5003;
import kotlin.reflect.jvm.internal.impl.storage.InterfaceC4845;
import kotlin.text.AbstractC5143;
import lin.xposed.hook.javaplugin.bean.GroupInfo;
import lin.xposed.hook.util.qq.QQEnvTool;
import p007.AbstractC6136;
import p032.AbstractC6317;
import p052.InterfaceC6542;
import p052.InterfaceC6557;
import p079.AbstractC6988;
import p088.InterfaceC7168;
import p088.InterfaceC7177;
import p090.InterfaceC7185;
import p090.InterfaceC7186;
import p101.InterfaceC7253;
import p142.InterfaceC7536;
import p205.C7898;
import p205.C7900;
import p346.AbstractC8850;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言苏楪哲兰子世.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9124 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static C1543 f25502;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final String m14659(InterfaceC6542 interfaceC6542) {
        interfaceC6542.getClass();
        try {
            return String.valueOf(interfaceC6542.invoke());
        } catch (Exception e) {
            return "Log message invocation failed: " + e;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final void m14660(AutoCloseable autoCloseable, Throwable th) throws Exception {
        boolean zIsTerminated;
        if (autoCloseable != null) {
            if (th != null) {
                try {
                    AbstractC6136.m11534(autoCloseable);
                    return;
                } catch (Throwable th2) {
                    AbstractC5186.m10212(th, th2);
                    return;
                }
            }
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
                return;
            }
            if (!(autoCloseable instanceof ExecutorService)) {
                if (autoCloseable instanceof TypedArray) {
                    ((TypedArray) autoCloseable).recycle();
                    return;
                }
                if (autoCloseable instanceof MediaMetadataRetriever) {
                    ((MediaMetadataRetriever) autoCloseable).release();
                    return;
                } else if (autoCloseable instanceof MediaDrm) {
                    ((MediaDrm) autoCloseable).release();
                    return;
                } else {
                    C5919.m11245();
                    return;
                }
            }
            ExecutorService executorService = (ExecutorService) autoCloseable;
            if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
                return;
            }
            executorService.shutdown();
            boolean z = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        executorService.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final InterfaceC7177 m14661(InterfaceC7186 interfaceC7186) {
        interfaceC7186.getClass();
        InterfaceC7177 interfaceC7177 = interfaceC7186 instanceof InterfaceC7177 ? (InterfaceC7177) interfaceC7186 : null;
        if (interfaceC7177 != null) {
            return interfaceC7177;
        }
        C5919.m11250(AbstractC2442.m4555(AbstractC4395.f12971, interfaceC7186.getClass(), new StringBuilder("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got ")));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static void m14662(StringBuilder sb, String str) {
        str.getClass();
        sb.append('\"');
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\n') {
                sb.append("%0A");
            } else if (cCharAt == '\r') {
                sb.append("%0D");
            } else if (cCharAt != '\"') {
                sb.append(cCharAt);
            } else {
                sb.append("%22");
            }
        }
        sb.append('\"');
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final void m14663(InterfaceC7185 interfaceC7185) {
        interfaceC7185.getClass();
        if ((interfaceC7185 instanceof InterfaceC7168 ? (InterfaceC7168) interfaceC7185 : null) != null) {
            return;
        }
        C5919.m11250(AbstractC2442.m4555(AbstractC4395.f12971, interfaceC7185.getClass(), new StringBuilder("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got ")));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Bitmap m14664(Image image) {
        Image.Plane[] planes = image.getPlanes();
        planes.getClass();
        Image.Plane plane = planes[0];
        int height = image.getHeight() * image.getWidth();
        int[] iArr = new int[height];
        plane.getBuffer().asIntBuffer().get(iArr);
        for (int i = 0; i < height; i++) {
            int i2 = iArr[i];
            iArr[i] = AbstractC1581.m2863(AbstractC1581.m2871(i2 & Opcodes.CONST_METHOD_TYPE, (i2 >> 8) & Opcodes.CONST_METHOD_TYPE, (i2 >> 16) & Opcodes.CONST_METHOD_TYPE, (i2 >> 24) & Opcodes.CONST_METHOD_TYPE));
        }
        return Bitmap.createBitmap(iArr, image.getWidth(), image.getHeight(), Bitmap.Config.ARGB_8888);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static BitmapDrawable m14665(Context context, String str) {
        BitmapDrawable bitmapDrawable = null;
        if (str != null && !str.isEmpty()) {
            try {
                FileInputStream fileInputStream = new FileInputStream(str);
                BitmapDrawable bitmapDrawable2 = new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(fileInputStream));
                try {
                    fileInputStream.close();
                    return bitmapDrawable2;
                } catch (IOException e) {
                    try {
                        throw new RuntimeException(e);
                    } catch (FileNotFoundException e2) {
                        e = e2;
                        bitmapDrawable = bitmapDrawable2;
                        e.printStackTrace();
                        return bitmapDrawable;
                    }
                }
            } catch (FileNotFoundException e3) {
                e = e3;
            }
        }
        return bitmapDrawable;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final C5003 m14666(AbstractC6988 abstractC6988) {
        Class clsM10068 = AbstractC5066.m10068(abstractC6988);
        C5003 c5003 = (C5003) (clsM10068 != null ? AbstractC4395.f12971.mo8927(clsM10068) : null);
        if (c5003 != null) {
            return c5003;
        }
        C4210.m8604(abstractC6988.mo9038(), "Type parameter container is not resolved: ");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final long m14667(float f, long j) {
        long jFloatToRawIntBits = j | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
        C7900[] c7900Arr = C7898.f21870;
        return jFloatToRawIntBits;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static C2301 m14668(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i = byteBufferDuplicate.getShort() & 65535;
        if (i > 100) {
            C5919.m11246("Cannot read metadata.");
            return null;
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                j = -1;
                break;
            }
            int i3 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i3) {
                break;
            }
            i2++;
        }
        if (j != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j - ((long) byteBufferDuplicate.position()))));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j2 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            for (int i4 = 0; i4 < j2; i4++) {
                int i5 = byteBufferDuplicate.getInt();
                long j3 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i5 || 1701669481 == i5) {
                    byteBufferDuplicate.position((int) (j3 + j));
                    C2301 c2301 = new C2301();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    c2301.f6463 = byteBufferDuplicate;
                    c2301.f6466 = iPosition;
                    int i6 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    c2301.f6464 = i6;
                    c2301.f6465 = ((ByteBuffer) c2301.f6463).getShort(i6);
                    return c2301;
                }
            }
        }
        C5919.m11246("Cannot read metadata.");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static Object m14669(String str) {
        Object objM11554 = AbstractC6136.m11554(-3937652216358503847L);
        C9125 c9125M14680 = C9125.m14680(objM11554.getClass());
        c9125M14680.f25504 = AbstractC3056.m6668(-3937677840133391783L);
        c9125M14680.m14683(String.class);
        return c9125M14680.m14682(objM11554, str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final long m14670(int i) {
        return m14667(i, 4294967296L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static ArrayList m14671() {
        ArrayList arrayList = new ArrayList();
        Object objM11554 = AbstractC6136.m11554(-3937652216358503847L);
        C9125 c9125M14680 = C9125.m14680(objM11554.getClass());
        c9125M14680.f25504 = AbstractC3056.m6668(-3937652117574256039L);
        for (Object obj : (List) c9125M14680.m14682(objM11554, new Object[0])) {
            GroupInfo groupInfo = new GroupInfo();
            String str = (String) XposedHelpers.getObjectField(obj, AbstractC3056.m6668(-3937678540213061031L));
            String str2 = (String) XposedHelpers.getObjectField(obj, AbstractC3056.m6668(-3937678063471691175L));
            String uidFromUin = QQEnvTool.getUidFromUin((String) XposedHelpers.getObjectField(obj, AbstractC3056.m6668(-3937678072061625767L)));
            groupInfo.GroupUin = str;
            groupInfo.GroupName = str2;
            groupInfo.GroupOwner = uidFromUin;
            groupInfo.IsOwnerOrAdmin = AbstractC8850.m14487(obj);
            String str3 = (String) AbstractC6317.m11831(String.class, AbstractC3056.m6668(-3937678029111952807L), obj);
            ArrayList<String> arrayList2 = new ArrayList<>();
            if (str3 != null) {
                for (String str4 : str3.split(AbstractC3056.m6668(-3937661416178451879L))) {
                    if (!TextUtils.isEmpty(str4)) {
                        arrayList2.add(str4);
                    }
                }
            } else {
                arrayList2.addAll(AbstractC8850.m14488(groupInfo.GroupUin));
            }
            arrayList2.add(groupInfo.GroupOwner);
            groupInfo.AdminList = arrayList2;
            groupInfo.sourceInfo = obj;
            arrayList.add(groupInfo);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final Object m14672(InterfaceC4845 interfaceC4845, InterfaceC5087 interfaceC5087) {
        interfaceC4845.getClass();
        interfaceC5087.getClass();
        return interfaceC4845.invoke();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static String m14673(ByteBuffer byteBuffer) throws UTFDataFormatException {
        StringBuilder sb = new StringBuilder();
        while (byteBuffer.hasRemaining()) {
            char c = (char) (byteBuffer.get() & DefaultClassResolver.NAME);
            if (c == 0) {
                return sb.toString();
            }
            if (c < 128) {
                sb.append(c);
            } else if ((c & 224) == 192) {
                byte b = byteBuffer.get();
                if ((b & 192) != 128) {
                    throw new UTFDataFormatException("bad second byte");
                }
                sb.append((char) (((c & 31) << 6) | (b & 63)));
            } else {
                if ((c & 240) != 224) {
                    throw new UTFDataFormatException("bad byte");
                }
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                if ((b2 & 192) != 128 || (b3 & 192) != 128) {
                    throw new UTFDataFormatException("bad second or third byte");
                }
                sb.append((char) (((c & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63)));
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C3885 m14674(String str, InterfaceC6542 interfaceC6542, InterfaceC6557 interfaceC6557) {
        interfaceC6542.getClass();
        C3885 c3885 = new C3885(0);
        C4396 c4396 = AbstractC4395.f12971;
        c4396.mo8927(AbstractC3884.class);
        try {
            C5084 c5084 = C5084.f14636;
            AbstractC4393 abstractC4393Mo8931 = c4396.mo8931(c4396.mo8927(C3885.class), KVariance.INVARIANT);
            c4396.mo8930(abstractC4393Mo8931, Collections.singletonList(AbstractC4395.m8922(Object.class)));
            AbstractC4395.m8921(AbstractC3884.class, AbstractC5089.m10096(c4396.mo8929(abstractC4393Mo8931, Collections.EMPTY_LIST, false)));
        } catch (Throwable unused) {
        }
        if (!AbstractC5143.m10164(str)) {
            return c3885;
        }
        C5919.m11249("Name can't be blank");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final InterfaceC7536 m14675(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
            InterfaceC7536 interfaceC7536 = tag instanceof InterfaceC7536 ? (InterfaceC7536) tag : null;
            if (interfaceC7536 != null) {
                return interfaceC7536;
            }
            Object objM6643 = AbstractC3055.m6643(view);
            view = objM6643 instanceof View ? (View) objM6643 : null;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final long m14676(double d) {
        return m14667((float) d, 4294967296L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static void m14677(Drawable drawable, String str, Bitmap.CompressFormat compressFormat) {
        if (drawable == null) {
            return;
        }
        try {
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
            if (!file.exists()) {
                file.createNewFile();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ((BitmapDrawable) drawable).getBitmap().compress(compressFormat, 100, fileOutputStream);
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final HashSet m14678(Iterable iterable) {
        iterable.getClass();
        HashSet hashSet = new HashSet();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Set setMo9176 = ((InterfaceC7253) it.next()).mo9176();
            if (setMo9176 == null) {
                return null;
            }
            AbstractC4343.m8794(setMo9176, hashSet);
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public abstract boolean mo4406();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public abstract void mo7192(Typeface typeface, boolean z);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public abstract View mo4407(int i);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public abstract void mo7193(int i);
}
