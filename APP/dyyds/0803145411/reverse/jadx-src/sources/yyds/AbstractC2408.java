package yyds;

import android.app.Dialog;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.view.Display;
import android.view.RoundedCorner;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import com.android.app.CustomRecyclerView;
import com.bumptech.glide.ComponentCallbacks2C0040;
import com.p000ss.android.ugc.aweme.yyds.R;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/* JADX INFO: renamed from: yyds.ᲇᛲᲁᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2408 implements InterfaceC1824 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final C0415 f11840 = new C0415("RESUME_TOKEN", 1);

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final C1196 f11841 = new C1196(2);

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final C1196 f11842 = new C1196(3);

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static ClassLoader f11843;

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public static boolean m4446(String[] strArr) {
        for (String str : strArr) {
            if (!TextUtils.isEmpty(m4448(str))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static long m4447(RandomAccessFile randomAccessFile) throws Exception {
        long length = randomAccessFile.length();
        if (length < 22) {
            throw new Exception(AbstractC2328.m4341(-524123021935470L));
        }
        long jMin = Math.min(length, 65557L);
        randomAccessFile.seek(length - jMin);
        int i = (int) jMin;
        byte[] bArr = new byte[i];
        randomAccessFile.readFully(bArr);
        for (int i2 = i - 22; -1 < i2; i2--) {
            if (bArr[i2] == 80 && bArr[i2 + 1] == 75 && bArr[i2 + 2] == 5 && bArr[i2 + 3] == 6) {
                return ((long) ByteBuffer.wrap(bArr, i2 + 16, 4).order(ByteOrder.LITTLE_ENDIAN).getInt()) & 4294967295L;
            }
        }
        throw new Exception(AbstractC2328.m4341(-524191741412206L));
    }

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public static String m4448(String str) throws Throwable {
        String property;
        if (str != null && !str.isEmpty()) {
            FileInputStream fileInputStream = null;
            try {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                property = (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, "");
            } catch (Exception unused) {
                property = null;
            }
            if (property != null && !property.isEmpty()) {
                return property;
            }
            try {
                property = m4456(str);
            } catch (IOException unused2) {
            }
            if (property != null && !property.isEmpty()) {
                return property;
            }
            try {
                try {
                    Properties properties = new Properties();
                    FileInputStream fileInputStream2 = new FileInputStream(new File(Environment.getRootDirectory(), "build.prop"));
                    try {
                        properties.load(fileInputStream2);
                        property = properties.getProperty(str, "");
                        fileInputStream2.close();
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream = fileInputStream2;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException unused3) {
                            }
                        }
                        throw th;
                    }
                } catch (IOException unused4) {
                }
                if (property != null && !property.isEmpty()) {
                    return property;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public static String m4449(String str) {
        AbstractC2328.m4341(-524028532654958L);
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(str, AbstractC2328.m4341(-524114432000878L));
            try {
                byte[] bArrM4460 = m4460(randomAccessFile, m4454(randomAccessFile, m4447(randomAccessFile)));
                randomAccessFile.close();
                ArrayList arrayListM4450 = m4450(bArrM4460);
                if (arrayListM4450.isEmpty()) {
                    return AbstractC2328.m4341(-524062892393326L);
                }
                return AbstractC2070.m3943(MessageDigest.getInstance(AbstractC2328.m4341(-524067187360622L)).digest((byte[]) arrayListM4450.get(0)), AbstractC2328.m4341(-524101547098990L), new C0061(3));
            } finally {
            }
        } catch (Exception unused) {
            return AbstractC2328.m4341(-524110137033582L);
        }
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static ArrayList m4450(byte[] bArr) throws Exception {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        ByteBuffer byteBufferOrder = byteBufferWrap.order(byteOrder);
        byteBufferOrder.getInt();
        byteBufferOrder.getInt();
        byte[] bArr2 = new byte[byteBufferOrder.getInt()];
        byteBufferOrder.get(bArr2);
        ByteBuffer byteBufferOrder2 = ByteBuffer.wrap(bArr2).order(byteOrder);
        ArrayList arrayList = new ArrayList();
        byteBufferOrder2.position(byteBufferOrder2.position() + byteBufferOrder2.getInt());
        int iPosition = byteBufferOrder2.position() + byteBufferOrder2.getInt();
        while (byteBufferOrder2.position() < iPosition) {
            byte[] bArr3 = new byte[byteBufferOrder2.getInt()];
            byteBufferOrder2.get(bArr3);
            arrayList.add(bArr3);
        }
        if (arrayList.isEmpty()) {
            throw new Exception(AbstractC2328.m4341(-525012080165742L));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public static C2308 m4451(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i = byteBufferDuplicate.getShort() & 65535;
        if (i > 100) {
            C0188.m804("Cannot read metadata.");
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
                    C2308 c2308 = new C2308();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    c2308.f9366 = byteBufferDuplicate;
                    c2308.f9365 = iPosition;
                    int i6 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    c2308.f9367 = i6;
                    c2308.f9364 = ((ByteBuffer) c2308.f9366).getShort(i6);
                    return c2308;
                }
            }
        }
        C0188.m804("Cannot read metadata.");
        return null;
    }

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public static final void m4452(C0644 c0644, List list, int i) {
        String strM1999;
        String str;
        Button button = (Button) c0644.f3099;
        if (i > 0) {
            strM1999 = AbstractC0897.m1999(new StringBuilder(AbstractC2328.m4341(-120585074672494L)), i, ')');
        } else {
            strM1999 = AbstractC2328.m4341(-120615139443566L) + list.size() + ')';
        }
        button.setText(strM1999);
        ((Button) c0644.f3102).setText(AbstractC2328.m4341(i == list.size() ? -120645204214638L : -120666679051118L));
        TextView textView = (TextView) c0644.f3101;
        if (i > 0) {
            str = AbstractC2328.m4341(-120679563953006L) + i + '/' + list.size() + AbstractC2328.m4341(-120701038789486L);
        } else {
            str = AbstractC2328.m4341(-120713923691374L) + list.size() + AbstractC2328.m4341(-120726808593262L);
        }
        textView.setText(str);
    }

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public static void m4453(Context context, List list, Aweme aweme) {
        AbstractC2328.m4341(-120091153433454L);
        AbstractC2328.m4341(-120125513171822L);
        AbstractC2328.m4341(-120168462844782L);
        if (list.isEmpty()) {
            AbstractC1960.m3789(AbstractC2328.m4341(-120194232648558L));
            return;
        }
        View viewInflate = AbstractC1115.m2309(context).inflate(R.layout.item_view, (ViewGroup) null, false);
        int i = R.id.btnBatchSave;
        Button button = (Button) AbstractC1741.m3479(viewInflate, R.id.btnBatchSave);
        if (button != null) {
            i = R.id.btnSelectAll;
            Button button2 = (Button) AbstractC1741.m3479(viewInflate, R.id.btnSelectAll);
            if (button2 != null) {
                i = R.id.ivClose;
                ImageView imageView = (ImageView) AbstractC1741.m3479(viewInflate, R.id.ivClose);
                if (imageView != null) {
                    i = R.id.recyclerView;
                    CustomRecyclerView customRecyclerView = (CustomRecyclerView) AbstractC1741.m3479(viewInflate, R.id.recyclerView);
                    if (customRecyclerView != null) {
                        i = R.id.titleText;
                        TextView textView = (TextView) AbstractC1741.m3479(viewInflate, R.id.titleText);
                        if (textView != null) {
                            i = R.id.tvSelectionSummary;
                            TextView textView2 = (TextView) AbstractC1741.m3479(viewInflate, R.id.tvSelectionSummary);
                            if (textView2 != null) {
                                LinearLayout linearLayout = (LinearLayout) viewInflate;
                                C0644 c0644 = new C0644(linearLayout, button, button2, imageView, customRecyclerView, textView, textView2);
                                AbstractC2328.m4341(-120232887354222L);
                                int iMin = Math.min(3, list.size());
                                if (iMin < 1) {
                                    iMin = 1;
                                }
                                customRecyclerView.setLayoutManager(new GridLayoutManager(iMin));
                                Dialog dialog = new Dialog(context, android.R.style.Theme.Translucent.NoTitleBar);
                                C0172 c0172 = new C0172();
                                C0827 c0827 = new C0827(list, new C2001(c0644, 8, list));
                                c0172.f997 = c0827;
                                customRecyclerView.setAdapter(c0827);
                                customRecyclerView.setHasFixedSize(true);
                                textView.setText(AbstractC2328.m4341(-120344556503918L));
                                m4452(c0644, list, 0);
                                if (list.size() > 1) {
                                    button2.setVisibility(0);
                                    button2.setOnClickListener(new ViewOnClickListenerC1462(7, c0172));
                                }
                                if (list.size() > 12) {
                                    C0644 c06442 = new C0644(customRecyclerView);
                                    Context context2 = customRecyclerView.getContext();
                                    c06442.f3099 = AbstractC1367.m2767(context2, R.drawable.afs_md2_track);
                                    c06442.f3102 = AbstractC1367.m2767(context2, R.drawable.afs_md2_thumb);
                                    c06442.f3101 = f11842;
                                    new C1402(customRecyclerView, new C0119(customRecyclerView), (Drawable) c06442.f3099, (Drawable) c06442.f3102, (InterfaceC1886) c06442.f3101, new C1809(customRecyclerView));
                                }
                                dialog.setContentView(linearLayout);
                                dialog.setCancelable(true);
                                dialog.setCanceledOnTouchOutside(true);
                                Window window = dialog.getWindow();
                                if (window != null) {
                                    window.setBackgroundDrawableResource(android.R.color.transparent);
                                    window.setGravity(80);
                                    window.setLayout(-1, (int) (((double) context.getResources().getDisplayMetrics().heightPixels) * 0.85d));
                                    window.setWindowAnimations(android.R.style.Animation.InputMethod);
                                }
                                imageView.setOnClickListener(new ViewOnClickListenerC1393(dialog, 6));
                                button.setOnClickListener(new ViewOnClickListenerC0365(dialog, context, list, c0172, aweme));
                                dialog.show();
                                return;
                            }
                        }
                    }
                }
            }
        }
        C0188.m789(AbstractC2328.m4341(-1738464895337326L).concat(viewInflate.getResources().getResourceName(i)));
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static long m4454(RandomAccessFile randomAccessFile, long j) throws Exception {
        if (j < 32) {
            throw new Exception(AbstractC2328.m4341(-524312000496494L));
        }
        randomAccessFile.seek(j - 16);
        byte[] bArr = new byte[16];
        randomAccessFile.readFully(bArr);
        byte[] bytes = AbstractC2328.m4341(-524410784744302L).getBytes(AbstractC0347.f1806);
        AbstractC2328.m4341(-524483799188334L);
        if (!Arrays.equals(bArr, bytes)) {
            throw new Exception(AbstractC2328.m4341(-524543928730478L));
        }
        randomAccessFile.seek(j - 24);
        long jM4459 = m4459(randomAccessFile);
        long j2 = (j - jM4459) - 8;
        randomAccessFile.seek(j2);
        if (jM4459 == m4459(randomAccessFile)) {
            return j2;
        }
        throw new Exception(AbstractC2328.m4341(-524659892847470L));
    }

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public static C1489 m4455(Display display, int i) {
        RoundedCorner roundedCorner;
        int i2;
        if (Build.VERSION.SDK_INT < 31 || (roundedCorner = display.getRoundedCorner(i)) == null) {
            return null;
        }
        int position = roundedCorner.getPosition();
        if (position != 0) {
            i2 = 1;
            if (position != 1) {
                i2 = 2;
                if (position != 2) {
                    i2 = 3;
                    if (position != 3) {
                        C0188.m798(AbstractC0897.m1989(position, "Invalid position: "));
                        return null;
                    }
                }
            }
        } else {
            i2 = 0;
        }
        return new C1489(i2, roundedCorner.getRadius(), roundedCorner.getCenter());
    }

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public static String m4456(String str) throws Throwable {
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop " + str).getInputStream()), 1024);
            try {
                String line = bufferedReader2.readLine();
                if (line != null) {
                    try {
                        bufferedReader2.close();
                    } catch (IOException unused) {
                    }
                    return line;
                }
                try {
                    bufferedReader2.close();
                } catch (IOException unused2) {
                }
                return null;
            } catch (Throwable th) {
                th = th;
                bufferedReader = bufferedReader2;
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException unused3) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public static final String m4457(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public static final String m4458(InterfaceC0274 interfaceC0274) {
        Object c2658;
        if (interfaceC0274 instanceof C1118) {
            return ((C1118) interfaceC0274).toString();
        }
        try {
            c2658 = interfaceC0274 + '@' + m4457(interfaceC0274);
        } catch (Throwable th) {
            c2658 = new C2658(th);
        }
        if (C2248.m4249(c2658) != null) {
            c2658 = interfaceC0274.getClass().getName() + '@' + m4457(interfaceC0274);
        }
        return (String) c2658;
    }

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public static long m4459(RandomAccessFile randomAccessFile) throws IOException {
        byte[] bArr = new byte[8];
        randomAccessFile.readFully(bArr);
        return ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).getLong();
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static byte[] m4460(RandomAccessFile randomAccessFile, long j) throws Exception {
        randomAccessFile.seek(j);
        long jM4459 = m4459(randomAccessFile) - 8;
        byte[] bytes = AbstractC2328.m4341(-524797331800942L).getBytes(AbstractC0347.f1806);
        AbstractC2328.m4341(-524870346244974L);
        while (jM4459 > 24) {
            long filePointer = randomAccessFile.getFilePointer();
            byte[] bArr = new byte[16];
            randomAccessFile.readFully(bArr);
            if (Arrays.equals(bArr, bytes)) {
                break;
            }
            randomAccessFile.seek(filePointer);
            long jM44592 = m4459(randomAccessFile);
            if (jM44592 < 4 || jM44592 > jM4459) {
                throw new Exception(AbstractC2328.m4341(-524930475787118L));
            }
            byte[] bArr2 = new byte[4];
            randomAccessFile.readFully(bArr2);
            int i = (int) (jM44592 - 4);
            if (ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN).getInt() == -262969152) {
                byte[] bArr3 = new byte[i];
                randomAccessFile.readFully(bArr3);
                return bArr3;
            }
            randomAccessFile.seek(randomAccessFile.getFilePointer() + ((long) i));
            jM4459 -= jM44592 + 8;
        }
        throw new Exception(AbstractC2328.m4341(-524973425460078L));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x041d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x041e  */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5, types: [yyds.ᛴᛲᲈᲁ] */
    /* JADX WARN: Type inference failed for: r4v0, types: [yyds.ᛷᛶᛷ] */
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C1578 m4461(ComponentCallbacks2C0040 componentCallbacks2C0040, ArrayList arrayList) {
        C1578 c1578;
        InterfaceC0814 c2027;
        InterfaceC0814 c0585;
        ?? c05852;
        C0064 c0064;
        C2267 c2267;
        Context context;
        Class cls;
        String str;
        int i;
        Iterator it;
        InterfaceC2587 interfaceC2587 = componentCallbacks2C0040.f383;
        C2267 c22672 = componentCallbacks2C0040.f384;
        Context applicationContext = componentCallbacks2C0040.f381.getApplicationContext();
        C0052 c0052 = componentCallbacks2C0040.f381.f12666;
        ?? c15782 = new C1578();
        C2222 c2222 = new C2222();
        C2135 c2135 = c15782.f8010;
        synchronized (c2135) {
            c2135.f10556.add(c2222);
        }
        C2493 c2493 = new C2493();
        C2135 c21352 = c15782.f8010;
        synchronized (c21352) {
            c21352.f10556.add(c2493);
        }
        Resources resources = applicationContext.getResources();
        ArrayList arrayListM3224 = c15782.m3224();
        C0705 c0705 = new C0705(applicationContext, arrayListM3224, interfaceC2587, c22672);
        C1687 c1687 = new C1687(interfaceC2587, new C0805(27));
        C2707 c2707 = new C2707(c15782.m3224(), resources.getDisplayMetrics(), interfaceC2587, c22672);
        int i2 = 0;
        if (((Map) c0052.f551).containsKey(AbstractC1367.class)) {
            c1578 = null;
            c0585 = new C2608(arrayListM3224, ((Map) c0052.f551).containsKey(AbstractC0797.class), c22672, ((Map) c0052.f551).containsKey(AbstractC0427.class));
            c2027 = new C1530(1);
            if (((Map) c0052.f551).containsKey(AbstractC0024.class)) {
                c05852 = new C0585(applicationContext);
            }
            c15782.m3231("Animation", InputStream.class, Drawable.class, new C1364(new C2133(arrayListM3224, 3, c22672), 1));
            c15782.m3231("Animation", ByteBuffer.class, Drawable.class, new C1364(new C2133(arrayListM3224, 3, c22672), 0));
            C0064 c00642 = new C0064(applicationContext);
            C0070 c0070 = new C0070(c22672);
            Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
            C0469 c0469 = new C0469(8);
            C1985 c1985 = new C1985(17);
            ContentResolver contentResolver = applicationContext.getContentResolver();
            c15782.m3226(ByteBuffer.class, new C1586());
            c15782.m3226(InputStream.class, new C2014(17, c22672));
            c15782.m3231("Bitmap", ByteBuffer.class, Bitmap.class, c2027);
            c15782.m3231("Bitmap", InputStream.class, Bitmap.class, c0585);
            if (c05852 == 0) {
                c15782.m3222(Bitmap.class, c05852);
                context = applicationContext;
                C0135 c0135 = C0135.f834;
                cls = Drawable.class;
                C2133 c2133 = c15782.f8008;
                synchronized (c2133) {
                    c0064 = c00642;
                    c2267 = c22672;
                    C0644 c0644 = (C0644) c2133.f10555;
                    synchronized (c0644) {
                        try {
                            ((ArrayList) c0644.f3099).add(0, new C2081(Uri.class, Uri.class, c0135));
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    ((C2794) c2133.f10553).f13658.clear();
                }
            } else {
                c0064 = c00642;
                c2267 = c22672;
                context = applicationContext;
                cls = Drawable.class;
            }
            str = Build.FINGERPRINT;
            if (!"robolectric".equals(str)) {
                c15782.m3231("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new C2027(c2707, 1));
            }
            c15782.m3231("Bitmap", AssetFileDescriptor.class, Bitmap.class, new C1687(interfaceC2587, new C0135(27)));
            c15782.m3231("Bitmap", ParcelFileDescriptor.class, Bitmap.class, c1687);
            C0135 c01352 = C0135.f834;
            c15782.m3225(Bitmap.class, Bitmap.class, c01352);
            c15782.m3231("Bitmap", Bitmap.class, Bitmap.class, new C1944(1));
            c15782.m3229(Bitmap.class, c0070);
            c15782.m3231("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new C0585(resources, c2027));
            c15782.m3231("BitmapDrawable", InputStream.class, BitmapDrawable.class, new C0585(resources, c0585));
            c15782.m3231("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new C0585(resources, c1687));
            if (c05852 != 0) {
                c15782.m3222(BitmapDrawable.class, new C0585(resources, c05852));
            }
            c15782.m3229(BitmapDrawable.class, new C2133(interfaceC2587, 11, c0070));
            C2267 c22673 = c2267;
            c15782.m3231("Animation", InputStream.class, C2380.class, new C2364(arrayListM3224, c0705, c22673));
            c15782.m3231("Animation", ByteBuffer.class, C2380.class, c0705);
            c15782.m3229(C2380.class, new C0469(17));
            c15782.m3225(C1575.class, C1575.class, c01352);
            c15782.m3231("Bitmap", C1575.class, Bitmap.class, new C1530(interfaceC2587));
            Class cls2 = cls;
            C0064 c00643 = c0064;
            c15782.m3231("legacy_append", Uri.class, cls2, c00643);
            c15782.m3231("legacy_append", Uri.class, Bitmap.class, new C0585(c00643, 1, interfaceC2587));
            c15782.m3228(new C2005(0));
            c15782.m3225(File.class, ByteBuffer.class, new C0135(10));
            c15782.m3225(File.class, InputStream.class, new C1990(new C1586()));
            c15782.m3231("legacy_append", File.class, File.class, new C1944(0));
            c15782.m3225(File.class, ParcelFileDescriptor.class, new C1990(new C0805(15)));
            c15782.m3225(File.class, File.class, c01352);
            c15782.m3228(new C1390(c22673));
            if ("robolectric".equals(str)) {
                i = 2;
                c15782.m3228(new C2005(2));
            } else {
                i = 2;
            }
            Context context2 = context;
            C1483 c1483 = new C1483(context2, i);
            C1483 c14832 = new C1483(context2, 0);
            C1483 c14833 = new C1483(context2, 1);
            Class cls3 = Integer.TYPE;
            c15782.m3225(cls3, InputStream.class, c1483);
            c15782.m3225(Integer.class, InputStream.class, c1483);
            c15782.m3225(cls3, AssetFileDescriptor.class, c14832);
            c15782.m3225(Integer.class, AssetFileDescriptor.class, c14832);
            c15782.m3225(cls3, cls2, c14833);
            c15782.m3225(Integer.class, cls2, c14833);
            c15782.m3225(Uri.class, InputStream.class, new C1483(context2, 9));
            c15782.m3225(Uri.class, AssetFileDescriptor.class, new C1483(context2, 8));
            C1482 c1482 = new C1482(resources, 3);
            C1482 c14822 = new C1482(resources, 1);
            C1482 c14823 = new C1482(resources, 2);
            c15782.m3225(Integer.class, Uri.class, c1482);
            c15782.m3225(cls3, Uri.class, c1482);
            c15782.m3225(Integer.class, AssetFileDescriptor.class, c14822);
            c15782.m3225(cls3, AssetFileDescriptor.class, c14822);
            c15782.m3225(Integer.class, InputStream.class, c14823);
            c15782.m3225(cls3, InputStream.class, c14823);
            c15782.m3225(String.class, InputStream.class, new C0052(12));
            c15782.m3225(Uri.class, InputStream.class, new C0052(12));
            int i3 = 25;
            c15782.m3225(String.class, InputStream.class, new C0805(i3));
            c15782.m3225(String.class, ParcelFileDescriptor.class, new C0469(i3));
            c15782.m3225(String.class, AssetFileDescriptor.class, new C1985(i3));
            c15782.m3225(Uri.class, InputStream.class, new C2733(context2.getAssets(), 1));
            c15782.m3225(Uri.class, AssetFileDescriptor.class, new C2733(context2.getAssets(), 0));
            c15782.m3225(Uri.class, InputStream.class, new C1483(context2, 6));
            c15782.m3225(Uri.class, InputStream.class, new C1483(context2, 7));
            c15782.m3225(Uri.class, InputStream.class, new C0683(context2, InputStream.class));
            c15782.m3225(Uri.class, ParcelFileDescriptor.class, new C0683(context2, ParcelFileDescriptor.class));
            boolean zContainsKey = ((Map) c0052.f551).containsKey(AbstractC0879.class);
            c15782.m3225(Uri.class, InputStream.class, new C1184(contentResolver, zContainsKey, 2));
            c15782.m3225(Uri.class, ParcelFileDescriptor.class, new C1184(contentResolver, zContainsKey, 1));
            c15782.m3225(Uri.class, AssetFileDescriptor.class, new C1184(contentResolver, zContainsKey, 0));
            int i4 = 26;
            c15782.m3225(Uri.class, InputStream.class, new C0805(i4));
            c15782.m3225(URL.class, InputStream.class, new C0469(i4));
            c15782.m3225(Uri.class, File.class, new C1483(context2, 5));
            c15782.m3225(C0714.class, InputStream.class, new C0052(27));
            int i5 = 9;
            c15782.m3225(byte[].class, ByteBuffer.class, new C1985(i5));
            c15782.m3225(byte[].class, InputStream.class, new C0805(i5));
            c15782.m3225(Uri.class, Uri.class, c01352);
            c15782.m3225(cls2, cls2, c01352);
            c15782.m3231("legacy_append", cls2, cls2, new C1944(2));
            c15782.m3223(Bitmap.class, BitmapDrawable.class, new C1482(resources, 0));
            c15782.m3223(Bitmap.class, byte[].class, c0469);
            c15782.m3223(cls2, byte[].class, new C0644(interfaceC2587, c0469, c1985, 12));
            c15782.m3223(C2380.class, byte[].class, c1985);
            C1687 c16872 = new C1687(interfaceC2587, new C1985(27));
            c15782.m3231("legacy_append", ByteBuffer.class, Bitmap.class, c16872);
            c15782.m3231("legacy_append", ByteBuffer.class, BitmapDrawable.class, new C0585(resources, c16872));
            it = arrayList.iterator();
            if (it.hasNext()) {
                return c15782;
            }
            it.next().getClass();
            C0188.m794();
            return c1578;
        }
        c1578 = null;
        c2027 = new C2027(c2707, i2);
        c0585 = new C0585(c2707, 2, c22672);
        c05852 = c1578;
        c15782.m3231("Animation", InputStream.class, Drawable.class, new C1364(new C2133(arrayListM3224, 3, c22672), 1));
        c15782.m3231("Animation", ByteBuffer.class, Drawable.class, new C1364(new C2133(arrayListM3224, 3, c22672), 0));
        C0064 c006422 = new C0064(applicationContext);
        C0070 c00702 = new C0070(c22672);
        Bitmap.CompressFormat compressFormat2 = Bitmap.CompressFormat.JPEG;
        C0469 c04692 = new C0469(8);
        C1985 c19852 = new C1985(17);
        ContentResolver contentResolver2 = applicationContext.getContentResolver();
        c15782.m3226(ByteBuffer.class, new C1586());
        c15782.m3226(InputStream.class, new C2014(17, c22672));
        c15782.m3231("Bitmap", ByteBuffer.class, Bitmap.class, c2027);
        c15782.m3231("Bitmap", InputStream.class, Bitmap.class, c0585);
        if (c05852 == 0) {
        }
        str = Build.FINGERPRINT;
        if (!"robolectric".equals(str)) {
        }
        c15782.m3231("Bitmap", AssetFileDescriptor.class, Bitmap.class, new C1687(interfaceC2587, new C0135(27)));
        c15782.m3231("Bitmap", ParcelFileDescriptor.class, Bitmap.class, c1687);
        C0135 c013522 = C0135.f834;
        c15782.m3225(Bitmap.class, Bitmap.class, c013522);
        c15782.m3231("Bitmap", Bitmap.class, Bitmap.class, new C1944(1));
        c15782.m3229(Bitmap.class, c00702);
        c15782.m3231("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new C0585(resources, c2027));
        c15782.m3231("BitmapDrawable", InputStream.class, BitmapDrawable.class, new C0585(resources, c0585));
        c15782.m3231("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new C0585(resources, c1687));
        if (c05852 != 0) {
        }
        c15782.m3229(BitmapDrawable.class, new C2133(interfaceC2587, 11, c00702));
        C2267 c226732 = c2267;
        c15782.m3231("Animation", InputStream.class, C2380.class, new C2364(arrayListM3224, c0705, c226732));
        c15782.m3231("Animation", ByteBuffer.class, C2380.class, c0705);
        c15782.m3229(C2380.class, new C0469(17));
        c15782.m3225(C1575.class, C1575.class, c013522);
        c15782.m3231("Bitmap", C1575.class, Bitmap.class, new C1530(interfaceC2587));
        Class cls22 = cls;
        C0064 c006432 = c0064;
        c15782.m3231("legacy_append", Uri.class, cls22, c006432);
        c15782.m3231("legacy_append", Uri.class, Bitmap.class, new C0585(c006432, 1, interfaceC2587));
        c15782.m3228(new C2005(0));
        c15782.m3225(File.class, ByteBuffer.class, new C0135(10));
        c15782.m3225(File.class, InputStream.class, new C1990(new C1586()));
        c15782.m3231("legacy_append", File.class, File.class, new C1944(0));
        c15782.m3225(File.class, ParcelFileDescriptor.class, new C1990(new C0805(15)));
        c15782.m3225(File.class, File.class, c013522);
        c15782.m3228(new C1390(c226732));
        if ("robolectric".equals(str)) {
        }
        Context context22 = context;
        C1483 c14834 = new C1483(context22, i);
        C1483 c148322 = new C1483(context22, 0);
        C1483 c148332 = new C1483(context22, 1);
        Class cls32 = Integer.TYPE;
        c15782.m3225(cls32, InputStream.class, c14834);
        c15782.m3225(Integer.class, InputStream.class, c14834);
        c15782.m3225(cls32, AssetFileDescriptor.class, c148322);
        c15782.m3225(Integer.class, AssetFileDescriptor.class, c148322);
        c15782.m3225(cls32, cls22, c148332);
        c15782.m3225(Integer.class, cls22, c148332);
        c15782.m3225(Uri.class, InputStream.class, new C1483(context22, 9));
        c15782.m3225(Uri.class, AssetFileDescriptor.class, new C1483(context22, 8));
        C1482 c14824 = new C1482(resources, 3);
        C1482 c148222 = new C1482(resources, 1);
        C1482 c148232 = new C1482(resources, 2);
        c15782.m3225(Integer.class, Uri.class, c14824);
        c15782.m3225(cls32, Uri.class, c14824);
        c15782.m3225(Integer.class, AssetFileDescriptor.class, c148222);
        c15782.m3225(cls32, AssetFileDescriptor.class, c148222);
        c15782.m3225(Integer.class, InputStream.class, c148232);
        c15782.m3225(cls32, InputStream.class, c148232);
        c15782.m3225(String.class, InputStream.class, new C0052(12));
        c15782.m3225(Uri.class, InputStream.class, new C0052(12));
        int i32 = 25;
        c15782.m3225(String.class, InputStream.class, new C0805(i32));
        c15782.m3225(String.class, ParcelFileDescriptor.class, new C0469(i32));
        c15782.m3225(String.class, AssetFileDescriptor.class, new C1985(i32));
        c15782.m3225(Uri.class, InputStream.class, new C2733(context22.getAssets(), 1));
        c15782.m3225(Uri.class, AssetFileDescriptor.class, new C2733(context22.getAssets(), 0));
        c15782.m3225(Uri.class, InputStream.class, new C1483(context22, 6));
        c15782.m3225(Uri.class, InputStream.class, new C1483(context22, 7));
        c15782.m3225(Uri.class, InputStream.class, new C0683(context22, InputStream.class));
        c15782.m3225(Uri.class, ParcelFileDescriptor.class, new C0683(context22, ParcelFileDescriptor.class));
        boolean zContainsKey2 = ((Map) c0052.f551).containsKey(AbstractC0879.class);
        c15782.m3225(Uri.class, InputStream.class, new C1184(contentResolver2, zContainsKey2, 2));
        c15782.m3225(Uri.class, ParcelFileDescriptor.class, new C1184(contentResolver2, zContainsKey2, 1));
        c15782.m3225(Uri.class, AssetFileDescriptor.class, new C1184(contentResolver2, zContainsKey2, 0));
        int i42 = 26;
        c15782.m3225(Uri.class, InputStream.class, new C0805(i42));
        c15782.m3225(URL.class, InputStream.class, new C0469(i42));
        c15782.m3225(Uri.class, File.class, new C1483(context22, 5));
        c15782.m3225(C0714.class, InputStream.class, new C0052(27));
        int i52 = 9;
        c15782.m3225(byte[].class, ByteBuffer.class, new C1985(i52));
        c15782.m3225(byte[].class, InputStream.class, new C0805(i52));
        c15782.m3225(Uri.class, Uri.class, c013522);
        c15782.m3225(cls22, cls22, c013522);
        c15782.m3231("legacy_append", cls22, cls22, new C1944(2));
        c15782.m3223(Bitmap.class, BitmapDrawable.class, new C1482(resources, 0));
        c15782.m3223(Bitmap.class, byte[].class, c04692);
        c15782.m3223(cls22, byte[].class, new C0644(interfaceC2587, c04692, c19852, 12));
        c15782.m3223(C2380.class, byte[].class, c19852);
        C1687 c168722 = new C1687(interfaceC2587, new C1985(27));
        c15782.m3231("legacy_append", ByteBuffer.class, Bitmap.class, c168722);
        c15782.m3231("legacy_append", ByteBuffer.class, BitmapDrawable.class, new C0585(resources, c168722));
        it = arrayList.iterator();
        if (it.hasNext()) {
        }
    }

    @Override // yyds.InterfaceC1824
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public void mo3309() {
    }

    @Override // yyds.InterfaceC1824
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public void mo2973() {
    }
}
