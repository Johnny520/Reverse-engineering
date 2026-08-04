package yyds;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ImageDecoder;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.Editable;
import android.text.Selection;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import androidx.cardview.widget.CardView;
import com.p000ss.android.ugc.awemes.WardDatabase;
import com.thegrizzlylabs.sardineandroid.model.Propstat;
import com.thegrizzlylabs.sardineandroid.model.Resourcetype;
import com.thegrizzlylabs.sardineandroid.model.Response;
import java.io.EOFException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.simpleframework.xml.strategy.Name;
import org.w3c.dom.Element;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: yyds.ᲀᲈᛶᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class C2133 implements InterfaceC0825, InterfaceC0097, InterfaceC0498, InterfaceC2656, InterfaceC0723, InterfaceC2295 {

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public static volatile C2133 f10545;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public Object f10553;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f10554;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public Object f10555;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static final int[] f10552 = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static final C1585 f10547 = new C1585(11);

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static final C1585 f10541 = new C1585(12);

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public static final C1585 f10543 = new C1585(13);

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public static final C1585 f10550 = new C1585(14);

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public static final C1585 f10548 = new C1585(15);

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public static final C1585 f10549 = new C1585(16);

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public static final C1585 f10542 = new C1585(17);

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public static final C1585 f10540 = new C1585(1);

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public static final C1585 f10544 = new C1585(0);

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public static final C1585 f10551 = new C1585(18);

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public static final C1985 f10546 = new C1985(28);

    public C2133(C2646 c2646, Response response) {
        String creationdate;
        Resourcetype resourcetype;
        String getcontentlength;
        this.f10554 = 18;
        List<Propstat> propstat = response.getPropstat();
        String getlastmodified = null;
        if (propstat.isEmpty()) {
            creationdate = null;
        } else {
            for (Propstat propstat2 : propstat) {
                if (propstat2.getProp() != null) {
                    creationdate = propstat2.getProp().getCreationdate();
                    break;
                }
            }
            creationdate = null;
        }
        AbstractC2515.m4560(creationdate);
        List<Propstat> propstat3 = response.getPropstat();
        if (!propstat3.isEmpty()) {
            Iterator<Propstat> it = propstat3.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Propstat next = it.next();
                if (next.getProp() != null) {
                    getlastmodified = next.getProp().getGetlastmodified();
                    break;
                }
            }
        }
        this.f10555 = AbstractC2515.m4560(getlastmodified);
        List<Propstat> propstat4 = response.getPropstat();
        if (!propstat4.isEmpty()) {
            Iterator<Propstat> it2 = propstat4.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Propstat next2 = it2.next();
                if (next2.getProp() != null) {
                    Resourcetype resourcetype2 = next2.getProp().getResourcetype();
                    if (resourcetype2 != null && resourcetype2.getCollection() != null) {
                        break;
                    } else if (next2.getProp().getGetcontenttype() != null) {
                        next2.getProp().getGetcontenttype();
                        break;
                    }
                }
            }
        }
        List<Propstat> propstat5 = response.getPropstat();
        long j = -1;
        if (!propstat5.isEmpty()) {
            for (Propstat propstat6 : propstat5) {
                if (propstat6.getProp() != null && (getcontentlength = propstat6.getProp().getGetcontentlength()) != null) {
                    try {
                        j = Long.parseLong(getcontentlength);
                        break;
                    } catch (NumberFormatException unused) {
                        C2646.f13039.warning("Failed to parse content length ".concat(getcontentlength));
                    }
                }
            }
        }
        this.f10553 = Long.valueOf(j);
        List<Propstat> propstat7 = response.getPropstat();
        if (!propstat7.isEmpty()) {
            Iterator<Propstat> it3 = propstat7.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Propstat next3 = it3.next();
                if (next3.getProp() != null) {
                    next3.getProp().getGetetag();
                    break;
                }
            }
        }
        List<Propstat> propstat8 = response.getPropstat();
        if (!propstat8.isEmpty()) {
            Iterator<Propstat> it4 = propstat8.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                Propstat next4 = it4.next();
                if (next4.getProp() != null) {
                    next4.getProp().getDisplayname();
                    break;
                }
            }
        }
        List<Propstat> propstat9 = response.getPropstat();
        if (propstat9.isEmpty()) {
            List list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList = new ArrayList();
            for (Propstat propstat10 : propstat9) {
                if (propstat10.getProp() != null && (resourcetype = propstat10.getProp().getResourcetype()) != null) {
                    if (resourcetype.getCollection() != null) {
                        arrayList.add(new C0356("DAV:", "collection", "D"));
                    }
                    if (resourcetype.getPrincipal() != null) {
                        arrayList.add(new C0356("DAV:", "principal", "D"));
                    }
                    Iterator<Element> it5 = resourcetype.getAny().iterator();
                    while (it5.hasNext()) {
                        arrayList.add(AbstractC2515.m4561(it5.next()));
                    }
                }
            }
        }
        List<Propstat> propstat11 = response.getPropstat();
        if (!propstat11.isEmpty()) {
            Iterator<Propstat> it6 = propstat11.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                Propstat next5 = it6.next();
                if (next5.getProp() != null) {
                    Resourcetype resourcetype3 = next5.getProp().getResourcetype();
                    if (resourcetype3 == null || resourcetype3.getCollection() == null) {
                        next5.getProp().getGetcontentlanguage();
                    }
                }
            }
        }
        List<Propstat> propstat12 = response.getPropstat();
        if (!propstat12.isEmpty()) {
            HashMap map = new HashMap();
            for (Propstat propstat13 : propstat12) {
                if (propstat13.getProp() != null) {
                    for (Element element : propstat13.getProp().getAny()) {
                        map.put(AbstractC2515.m4561(element), element.getTextContent());
                    }
                }
            }
        }
        List<Propstat> propstat14 = response.getPropstat();
        if (!propstat14.isEmpty()) {
            Iterator<Propstat> it7 = propstat14.iterator();
            while (true) {
                if (!it7.hasNext()) {
                    break;
                }
                Propstat next6 = it7.next();
                if (next6.getProp() != null) {
                    next6.getProp().getLockdiscovery();
                    break;
                }
            }
        }
        List<Propstat> propstat15 = response.getPropstat();
        if (propstat15.isEmpty()) {
            return;
        }
        for (Propstat propstat16 : propstat15) {
            if (propstat16.getProp() != null) {
                propstat16.getProp().getSupportedlock();
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0045, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0082, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006c A[EDGE_INSN: B:92:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085], EDGE_INSN: B:93:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085, LOOP_LABEL: LOOP:2: B:47:0x006e->B:58:0x0085]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00a2 A[ADDED_TO_REGION] */
    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m4041(C2561 c2561, Editable editable, int i, int i2, boolean z) {
        int iMin;
        if (editable != null && i >= 0 && i2 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z) {
                    int iMax = Math.max(i, 0);
                    int length = editable.length();
                    if (selectionStart < 0 || length < selectionStart || iMax < 0) {
                        selectionStart = -1;
                        int iMax2 = Math.max(i2, 0);
                        iMin = editable.length();
                        if (selectionEnd >= 0 || iMin < selectionEnd || iMax2 < 0) {
                            iMin = -1;
                            if (selectionStart != -1 && iMin != -1) {
                            }
                        } else {
                            loop2: while (true) {
                                boolean z2 = false;
                                while (true) {
                                    if (iMax2 == 0) {
                                        iMin = selectionEnd;
                                        break loop2;
                                    }
                                    if (selectionEnd >= iMin) {
                                        if (z2) {
                                            break;
                                        }
                                    } else {
                                        char cCharAt = editable.charAt(selectionEnd);
                                        if (z2) {
                                            break;
                                        }
                                        if (!Character.isSurrogate(cCharAt)) {
                                            iMax2--;
                                            selectionEnd++;
                                        } else {
                                            if (Character.isLowSurrogate(cCharAt)) {
                                                break loop2;
                                            }
                                            selectionEnd++;
                                            z2 = true;
                                        }
                                    }
                                }
                                iMax2--;
                                selectionEnd++;
                            }
                            iMin = -1;
                            if (selectionStart != -1) {
                            }
                        }
                    } else {
                        loop0: while (true) {
                            boolean z3 = false;
                            while (true) {
                                if (iMax == 0) {
                                    break loop0;
                                }
                                selectionStart--;
                                if (selectionStart >= 0) {
                                    char cCharAt2 = editable.charAt(selectionStart);
                                    if (z3) {
                                        break;
                                    }
                                    if (!Character.isSurrogate(cCharAt2)) {
                                        iMax--;
                                    } else {
                                        if (Character.isHighSurrogate(cCharAt2)) {
                                            break loop0;
                                        }
                                        z3 = true;
                                    }
                                } else {
                                    if (z3) {
                                        break loop0;
                                    }
                                    selectionStart = 0;
                                }
                            }
                            iMax--;
                        }
                        selectionStart = -1;
                        int iMax22 = Math.max(i2, 0);
                        iMin = editable.length();
                        if (selectionEnd >= 0) {
                            iMin = -1;
                            if (selectionStart != -1) {
                            }
                        }
                    }
                } else {
                    selectionStart = Math.max(selectionStart - i, 0);
                    iMin = Math.min(selectionEnd + i2, editable.length());
                }
                C1893[] c1893Arr = (C1893[]) editable.getSpans(selectionStart, iMin, C1893.class);
                if (c1893Arr != null && c1893Arr.length > 0) {
                    for (C1893 c1893 : c1893Arr) {
                        int spanStart = editable.getSpanStart(c1893);
                        int spanEnd = editable.getSpanEnd(c1893);
                        selectionStart = Math.min(spanStart, selectionStart);
                        iMin = Math.max(spanEnd, iMin);
                    }
                    int iMax3 = Math.max(selectionStart, 0);
                    int iMin2 = Math.min(iMin, editable.length());
                    c2561.beginBatchEdit();
                    editable.delete(iMax3, iMin2);
                    c2561.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static C0418 m4042(ImageDecoder.Source source, int i, int i2, C0822 c0822) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new C1203(i, i2, c0822));
        if (drawableDecodeDrawable instanceof AnimatedImageDrawable) {
            return new C0418(0, (AnimatedImageDrawable) drawableDecodeDrawable);
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + drawableDecodeDrawable);
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public static boolean m4043(Editable editable, KeyEvent keyEvent, boolean z) {
        C1893[] c1893Arr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (c1893Arr = (C1893[]) editable.getSpans(selectionStart, selectionEnd, C1893.class)) != null && c1893Arr.length > 0) {
                for (C1893 c1893 : c1893Arr) {
                    int spanStart = editable.getSpanStart(c1893);
                    int spanEnd = editable.getSpanEnd(c1893);
                    if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛸᛴᛵᛶ, reason: contains not printable characters */
    public static void m4044(String str, Object obj, StringBuilder sb, C1083 c1083) {
        if (str == null) {
            sb.append("null");
        } else if (c1083.f4990.mo609(str)) {
            sb.append('\"');
            C1083 c10832 = AbstractC2084.f10334;
            c1083.f4992.mo1273(str, sb);
            sb.append('\"');
        } else {
            sb.append((CharSequence) str);
        }
        c1083.getClass();
        sb.append(':');
        if (obj instanceof String) {
            c1083.m2293((String) obj, sb);
        } else {
            AbstractC2084.m3986(obj, sb, c1083);
        }
    }

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public static int m4045(int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            i3++;
            if (i3 == i2) {
                i4++;
                i3 = 0;
            } else if (i3 > i2) {
                i4++;
                i3 = 1;
            }
        }
        return i3 + 1 > i2 ? i4 + 1 : i4;
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static String m4046(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("r8-abstract-class");
    }

    @Override // yyds.InterfaceC2295
    public InterfaceC1590 getSource() {
        return (C1770) this.f10553;
    }

    public String toString() {
        switch (this.f10554) {
            case 17:
                return ((Map) this.f10555).toString();
            case 27:
                StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
                C1995 c1995 = (C1995) this.f10555;
                C1995 c19952 = c1995.f10004;
                boolean z = false;
                while (!c19952.equals(c1995)) {
                    sb.append('{');
                    sb.append(c19952.f10002);
                    sb.append(':');
                    ArrayList arrayList = c19952.f10003;
                    sb.append(arrayList != null ? arrayList.size() : 0);
                    sb.append("}, ");
                    c19952 = c19952.f10004;
                    z = true;
                }
                if (z) {
                    sb.delete(sb.length() - 2, sb.length());
                }
                sb.append(" )");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: ᛱᛳᛶᛳ, reason: contains not printable characters */
    public void m4047(C1585 c1585, Class... clsArr) {
        for (Class cls : clsArr) {
            ((ConcurrentHashMap) this.f10555).put(cls, c1585);
        }
    }

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public KeyListener m4048(KeyListener keyListener) {
        if ((keyListener instanceof NumberKeyListener) || (keyListener instanceof C1269)) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new C1269(keyListener);
    }

    /* JADX INFO: renamed from: ᛱᛸᲁᲇ, reason: contains not printable characters */
    public void m4049() {
        synchronized (this) {
            ((AtomicInteger) this.f10555).decrementAndGet();
            if (((AtomicInteger) this.f10555).get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
        }
    }

    @Override // yyds.InterfaceC1081
    /* JADX INFO: renamed from: ᛱᲈᲁ */
    public boolean mo443(Object obj, File file, C0822 c0822) {
        return ((C0070) this.f10553).mo443(new C0656(((BitmapDrawable) ((InterfaceC2162) obj).get()).getBitmap(), (InterfaceC2587) this.f10555), file, c0822);
    }

    /* JADX INFO: renamed from: ᛲᛱᲁᛳ, reason: contains not printable characters */
    public Drawable m4050(Drawable drawable, boolean z) {
        if (!(drawable instanceof LayerDrawable)) {
            if (!(drawable instanceof BitmapDrawable)) {
                return drawable;
            }
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (((Bitmap) this.f10553) == null) {
                this.f10553 = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        int numberOfLayers = layerDrawable.getNumberOfLayers();
        Drawable[] drawableArr = new Drawable[numberOfLayers];
        for (int i = 0; i < numberOfLayers; i++) {
            int id = layerDrawable.getId(i);
            drawableArr[i] = m4050(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
        }
        LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
        for (int i2 = 0; i2 < numberOfLayers; i2++) {
            layerDrawable2.setId(i2, layerDrawable.getId(i2));
            layerDrawable2.setLayerGravity(i2, layerDrawable.getLayerGravity(i2));
            layerDrawable2.setLayerWidth(i2, layerDrawable.getLayerWidth(i2));
            layerDrawable2.setLayerHeight(i2, layerDrawable.getLayerHeight(i2));
            layerDrawable2.setLayerInsetLeft(i2, layerDrawable.getLayerInsetLeft(i2));
            layerDrawable2.setLayerInsetRight(i2, layerDrawable.getLayerInsetRight(i2));
            layerDrawable2.setLayerInsetTop(i2, layerDrawable.getLayerInsetTop(i2));
            layerDrawable2.setLayerInsetBottom(i2, layerDrawable.getLayerInsetBottom(i2));
            layerDrawable2.setLayerInsetStart(i2, layerDrawable.getLayerInsetStart(i2));
            layerDrawable2.setLayerInsetEnd(i2, layerDrawable.getLayerInsetEnd(i2));
        }
        return layerDrawable2;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0104  */
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InterfaceC2050 m4051(C2805 c2805, boolean z) {
        String str;
        InterfaceC2050 c0415;
        final Type type = c2805.f13683;
        Class cls = c2805.f13682;
        Map map = (Map) this.f10555;
        C0188 c0188 = null;
        if (map.get(type) != null) {
            C0188.m794();
            return null;
        }
        if (map.get(cls) != null) {
            C0188.m794();
            return null;
        }
        final int i = 1;
        final int i2 = 0;
        InterfaceC2050 interfaceC2050 = EnumSet.class.isAssignableFrom(cls) ? new InterfaceC2050() { // from class: yyds.ᲈᲁᛵᛸ
            @Override // yyds.InterfaceC2050
            /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
            public final Object mo807() {
                int i3 = i2;
                Type type2 = type;
                switch (i3) {
                    case 0:
                        if (!(type2 instanceof ParameterizedType)) {
                            throw new C1600("Invalid EnumSet type: " + type2);
                        }
                        Type type3 = ((ParameterizedType) type2).getActualTypeArguments()[0];
                        if (type3 instanceof Class) {
                            return EnumSet.noneOf((Class) type3);
                        }
                        throw new C1600("Invalid EnumSet type: " + type2);
                    default:
                        if (!(type2 instanceof ParameterizedType)) {
                            throw new C1600("Invalid EnumMap type: " + type2);
                        }
                        Type type4 = ((ParameterizedType) type2).getActualTypeArguments()[0];
                        if (type4 instanceof Class) {
                            return new EnumMap((Class) type4);
                        }
                        throw new C1600("Invalid EnumMap type: " + type2);
                }
            }
        } : cls == EnumMap.class ? new InterfaceC2050() { // from class: yyds.ᲈᲁᛵᛸ
            @Override // yyds.InterfaceC2050
            /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
            public final Object mo807() {
                int i3 = i;
                Type type2 = type;
                switch (i3) {
                    case 0:
                        if (!(type2 instanceof ParameterizedType)) {
                            throw new C1600("Invalid EnumSet type: " + type2);
                        }
                        Type type3 = ((ParameterizedType) type2).getActualTypeArguments()[0];
                        if (type3 instanceof Class) {
                            return EnumSet.noneOf((Class) type3);
                        }
                        throw new C1600("Invalid EnumSet type: " + type2);
                    default:
                        if (!(type2 instanceof ParameterizedType)) {
                            throw new C1600("Invalid EnumMap type: " + type2);
                        }
                        Type type4 = ((ParameterizedType) type2).getActualTypeArguments()[0];
                        if (type4 instanceof Class) {
                            return new EnumMap((Class) type4);
                        }
                        throw new C1600("Invalid EnumMap type: " + type2);
                }
            }
        } : null;
        if (interfaceC2050 != null) {
            return interfaceC2050;
        }
        C2810.m4947((List) this.f10553);
        if (Modifier.isAbstract(cls.getModifiers())) {
            c0415 = null;
        } else {
            try {
                Constructor declaredConstructor = cls.getDeclaredConstructor(null);
                AbstractC1741 abstractC1741 = AbstractC1301.f5958;
                try {
                    declaredConstructor.setAccessible(true);
                    str = null;
                } catch (Exception e) {
                    str = "Failed making constructor '" + AbstractC1301.m2586(declaredConstructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e.getMessage() + AbstractC1301.m2584(e);
                }
                c0415 = str != null ? new C0415(str, i2) : new C1908(i2, declaredConstructor);
            } catch (NoSuchMethodException unused) {
                c0415 = null;
            }
        }
        if (c0415 != null) {
            return c0415;
        }
        if (Collection.class.isAssignableFrom(cls)) {
            if (cls.isAssignableFrom(ArrayList.class)) {
                c0188 = new C0188(6);
            } else if (cls.isAssignableFrom(LinkedHashSet.class)) {
                c0188 = new C0188(9);
            } else if (cls.isAssignableFrom(TreeSet.class)) {
                c0188 = new C0188(10);
            } else if (cls.isAssignableFrom(ArrayDeque.class)) {
                c0188 = new C0188(11);
            }
        } else if (Map.class.isAssignableFrom(cls)) {
            if (cls.isAssignableFrom(C1583.class)) {
                if (type instanceof ParameterizedType) {
                    Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
                    if (actualTypeArguments.length != 0 && AbstractC1917.m3698(actualTypeArguments[0]) == String.class) {
                    }
                }
                c0188 = new C0188(12);
            } else if (cls.isAssignableFrom(LinkedHashMap.class)) {
                c0188 = new C0188(13);
            } else if (cls.isAssignableFrom(TreeMap.class)) {
                c0188 = new C0188(14);
            } else if (cls.isAssignableFrom(ConcurrentHashMap.class)) {
                c0188 = new C0188(7);
            } else if (cls.isAssignableFrom(ConcurrentSkipListMap.class)) {
                c0188 = new C0188(8);
            }
        }
        if (c0188 != null) {
            return c0188;
        }
        String strM4046 = m4046(cls);
        if (strM4046 != null) {
            return new C0415(strM4046, i2);
        }
        if (z) {
            return new C1908(i, cls);
        }
        return new C0415("Unable to create instance of " + cls + "; Register an InstanceCreator or a TypeAdapter for this type.", i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x0209, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0109 A[Catch: IOException -> 0x0091, XmlPullParserException -> 0x0094, TryCatch #2 {IOException -> 0x0091, XmlPullParserException -> 0x0094, blocks: (B:20:0x0062, B:97:0x0209, B:28:0x0074, B:29:0x0082, B:31:0x0087, B:38:0x0097, B:46:0x00b1, B:41:0x00a0, B:44:0x00a9, B:47:0x00bf, B:51:0x00ce, B:53:0x00d6, B:54:0x00e0, B:63:0x0109, B:64:0x0110, B:65:0x0128, B:57:0x00e9, B:59:0x00f1, B:60:0x00ff, B:66:0x0129, B:68:0x0131, B:69:0x013f, B:72:0x0149, B:73:0x0154, B:74:0x016c, B:75:0x016d, B:78:0x0177, B:79:0x0182, B:80:0x019a, B:81:0x019b, B:83:0x01a3, B:84:0x01ac, B:87:0x01b6, B:88:0x01c0, B:89:0x01d8, B:90:0x01d9, B:93:0x01e3, B:94:0x01ed, B:95:0x0205, B:96:0x0206), top: B:105:0x0062 }] */
    /* JADX INFO: renamed from: ᛲᛳᛴᛸ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m4052(Context context, XmlResourceParser xmlResourceParser) {
        int eventType;
        C2049 c2049M1473;
        C0595 c0595 = new C0595();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlResourceParser.getAttributeName(i);
            String attributeValue = xmlResourceParser.getAttributeValue(i);
            if (attributeName != null && attributeValue != null && Name.MARK.equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), Name.MARK, context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                try {
                    eventType = xmlResourceParser.getEventType();
                    c2049M1473 = null;
                } catch (IOException e) {
                    Log.e("ConstraintSet", "Error parsing XML resource", e);
                } catch (XmlPullParserException e2) {
                    Log.e("ConstraintSet", "Error parsing XML resource", e2);
                }
                while (eventType != 1) {
                    if (eventType == 0) {
                        xmlResourceParser.getName();
                    } else if (eventType == 2) {
                        String name = xmlResourceParser.getName();
                        switch (name.hashCode()) {
                            case -2025855158:
                                if (name.equals("Layout")) {
                                    if (c2049M1473 == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c2049M1473.f10189.m3677(context, Xml.asAttributeSet(xmlResourceParser));
                                } else {
                                    continue;
                                }
                                break;
                            case -1984451626:
                                if (name.equals("Motion")) {
                                    if (c2049M1473 == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c2049M1473.f10187.m2532(context, Xml.asAttributeSet(xmlResourceParser));
                                } else {
                                    continue;
                                }
                                break;
                            case -1962203927:
                                if (name.equals("ConstraintOverride")) {
                                    c2049M1473 = C0595.m1473(context, Xml.asAttributeSet(xmlResourceParser), true);
                                }
                                break;
                            case -1269513683:
                                if (name.equals("PropertySet")) {
                                    if (c2049M1473 == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c2049M1473.f10186.m3916(context, Xml.asAttributeSet(xmlResourceParser));
                                } else {
                                    continue;
                                }
                                break;
                            case -1238332596:
                                if (name.equals("Transform")) {
                                    if (c2049M1473 == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c2049M1473.f10184.m2964(context, Xml.asAttributeSet(xmlResourceParser));
                                } else {
                                    continue;
                                }
                                break;
                            case -71750448:
                                if (name.equals("Guideline")) {
                                    c2049M1473 = C0595.m1473(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    c2049M1473.f10189.f9551 = true;
                                }
                                break;
                            case 366511058:
                                if (name.equals("CustomMethod")) {
                                    if (c2049M1473 != null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    C1315.m2609(context, xmlResourceParser, c2049M1473.f10188);
                                } else {
                                    continue;
                                }
                                break;
                            case 1331510167:
                                if (name.equals("Barrier")) {
                                    c2049M1473 = C0595.m1473(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    c2049M1473.f10189.f9591 = 1;
                                }
                                break;
                            case 1791837707:
                                if (!name.equals("CustomAttribute")) {
                                    continue;
                                } else if (c2049M1473 != null) {
                                }
                                break;
                            case 1803088381:
                                if (name.equals("Constraint")) {
                                    c2049M1473 = C0595.m1473(context, Xml.asAttributeSet(xmlResourceParser), false);
                                }
                                break;
                        }
                    } else if (eventType == 3) {
                        String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.ROOT);
                        switch (lowerCase.hashCode()) {
                            case -2075718416:
                                if (lowerCase.equals("guideline")) {
                                    c0595.f2819.put(Integer.valueOf(c2049M1473.f10185), c2049M1473);
                                    c2049M1473 = null;
                                }
                                break;
                            case -190376483:
                                if (lowerCase.equals("constraint")) {
                                    c0595.f2819.put(Integer.valueOf(c2049M1473.f10185), c2049M1473);
                                    c2049M1473 = null;
                                }
                                break;
                            case 426575017:
                                if (lowerCase.equals("constraintoverride")) {
                                    c0595.f2819.put(Integer.valueOf(c2049M1473.f10185), c2049M1473);
                                    c2049M1473 = null;
                                }
                                break;
                            case 2146106725:
                                if (lowerCase.equals("constraintset")) {
                                    ((SparseArray) this.f10553).put(identifier, c0595);
                                    return;
                                }
                                break;
                                break;
                        }
                    }
                    eventType = xmlResourceParser.next();
                }
                ((SparseArray) this.f10553).put(identifier, c0595);
                return;
            }
        }
    }

    @Override // yyds.InterfaceC0498
    /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
    public boolean mo1347() {
        return ((InterfaceC0498) this.f10555).mo1347();
    }

    @Override // yyds.InterfaceC0097
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public void mo385(C1829 c1829) {
        AbstractC2328.m4341(-999275253891950L);
        ((InterfaceC1549) this.f10555).mo371(c1829);
    }

    /* JADX INFO: renamed from: ᛲᛶᛱᲈ, reason: contains not printable characters */
    public void m4053(AbstractC0451 abstractC0451) {
        C0299 c0299 = (C0299) this.f10555;
        ((ActionMode.Callback) c0299.f1577).onDestroyActionMode(c0299.m950(abstractC0451));
        LayoutInflaterFactory2C2181 layoutInflaterFactory2C2181 = (LayoutInflaterFactory2C2181) this.f10553;
        if (layoutInflaterFactory2C2181.f10683 != null) {
            layoutInflaterFactory2C2181.f10676.getDecorView().removeCallbacks(layoutInflaterFactory2C2181.f10723);
        }
        if (layoutInflaterFactory2C2181.f10695 != null) {
            C0140 c0140 = layoutInflaterFactory2C2181.f10694;
            if (c0140 != null) {
                c0140.m627();
            }
            C0140 c0140M3343 = AbstractC1640.m3343(layoutInflaterFactory2C2181.f10695);
            c0140M3343.m626(0.0f);
            layoutInflaterFactory2C2181.f10694 = c0140M3343;
            c0140M3343.m629(new C1469(2, this));
        }
        layoutInflaterFactory2C2181.f10700 = null;
        ViewGroup viewGroup = layoutInflaterFactory2C2181.f10675;
        WeakHashMap weakHashMap = AbstractC1640.f8352;
        viewGroup.requestApplyInsets();
        layoutInflaterFactory2C2181.m4147();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0048 A[Catch: all -> 0x009d, TRY_LEAVE, TryCatch #5 {all -> 0x009d, blocks: (B:20:0x0044, B:22:0x0048, B:25:0x0059, B:29:0x0060, B:31:0x006c, B:33:0x0077, B:32:0x0072, B:27:0x005d, B:28:0x005f, B:45:0x0095, B:46:0x009c, B:24:0x0054), top: B:67:0x0044, outer: #0, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0095 A[Catch: all -> 0x009d, TRY_ENTER, TryCatch #5 {all -> 0x009d, blocks: (B:20:0x0044, B:22:0x0048, B:25:0x0059, B:29:0x0060, B:31:0x006c, B:33:0x0077, B:32:0x0072, B:27:0x005d, B:28:0x005f, B:45:0x0095, B:46:0x009c, B:24:0x0054), top: B:67:0x0044, outer: #0, inners: #2 }] */
    @Override // yyds.InterfaceC0498
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InterfaceC0124 mo1348(String str) {
        FileChannel fileChannel;
        FileChannel fileChannel2;
        C1491 c1491 = (C1491) this.f10553;
        if (!str.equals(":memory:")) {
            str = ((C0544) c1491.f7041).f2605.getDatabasePath(str).getAbsolutePath();
        }
        boolean z = true;
        C0062 c0062 = new C0062(str, (c1491.f7038 || c1491.f7039 || AbstractC1544.m3188(str, ":memory:")) ? false : true);
        ReentrantLock reentrantLock = c0062.f589;
        reentrantLock.lock();
        C2133 c2133 = c0062.f590;
        if (c2133 != null) {
            try {
                c2133.m4059();
                try {
                    try {
                        if (!c1491.f7039) {
                            throw new IllegalStateException("Recursive database initialization detected. Did you try to use the database instance during initialization? Maybe in one of the callbacks?");
                        }
                        InterfaceC0124 interfaceC0124Mo1348 = ((InterfaceC0498) this.f10555).mo1348(str);
                        if (c1491.f7038) {
                            C1491.m2991(interfaceC0124Mo1348);
                            if (((C0544) c1491.f7041).f2609 == 3) {
                                AbstractC2328.m4335(interfaceC0124Mo1348, "PRAGMA synchronous = NORMAL");
                            } else {
                                AbstractC2328.m4335(interfaceC0124Mo1348, "PRAGMA synchronous = FULL");
                            }
                            ((AbstractC0353) c1491.f7043).mo1052(interfaceC0124Mo1348);
                        } else {
                            try {
                                c1491.f7039 = true;
                                c1491.m3002(interfaceC0124Mo1348);
                                c1491.f7039 = false;
                            } catch (Throwable th) {
                                c1491.f7039 = false;
                                throw th;
                            }
                        }
                        if (c2133 != null && (fileChannel2 = (FileChannel) c2133.f10553) != null) {
                            try {
                                fileChannel2.close();
                                c2133.f10553 = null;
                            } finally {
                            }
                        }
                        return interfaceC0124Mo1348;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    if (c2133 != null && (fileChannel = (FileChannel) c2133.f10553) != null) {
                        try {
                            fileChannel.close();
                            c2133.f10553 = null;
                        } finally {
                        }
                    }
                    throw th3;
                }
            } catch (Throwable th4) {
                th = th4;
                z = false;
            }
        } else {
            if (!c1491.f7039) {
            }
        }
        try {
            if (z) {
                throw th;
            }
            throw new IllegalStateException("Unable to open database '" + str + "'. Was a proper path / name used in Room's database builder?", th);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public boolean m4054(String str, String str2) {
        AbstractC2328.m4341(-1140871735706478L);
        AbstractC2328.m4341(-1140906095444846L);
        AbstractC2328.m4341(-1140695642047342L);
        AbstractC2328.m4341(-1140730001785710L);
        return ((C2770) AbstractC2217.m4197(C2586.f12764, new C0916(this, str, str2, null, 1))) != null;
    }

    @Override // yyds.InterfaceC0723
    /* JADX INFO: renamed from: ᛳᲁᲁᲇ */
    public int mo444(C0822 c0822) {
        return 2;
    }

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public boolean m4055(CharSequence charSequence, int i, int i2, C0758 c0758) {
        if (c0758.f3509 == 0) {
            C2415 c2415 = (C2415) this.f10553;
            C0960 c0960M1706 = c0758.m1706();
            int iM3645 = c0960M1706.m3645(8);
            if (iM3645 != 0) {
                ((ByteBuffer) c0960M1706.f9366).getShort(iM3645 + c0960M1706.f9365);
            }
            c2415.getClass();
            ThreadLocal threadLocal = C2415.f11921;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            c0758.f3509 = c2415.f11922.hasGlyph(sb.toString()) ? 2 : 1;
        }
        return c0758.f3509 == 2;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public boolean m4056() {
        synchronized (this) {
            if (((AtomicBoolean) this.f10553).get()) {
                return false;
            }
            ((AtomicInteger) this.f10555).incrementAndGet();
            return true;
        }
    }

    /* JADX INFO: renamed from: ᛵᲀᛵᛸ, reason: contains not printable characters */
    public void m4057(C2246 c2246) {
        ExecutorC0183 executorC0183 = (ExecutorC0183) this.f10553;
        C2014 c2014 = (C2014) this.f10555;
        int i = c2246.f11088;
        if (i != 0) {
            executorC0183.execute(new RunnableC1128(c2014, i));
        } else {
            executorC0183.execute(new RunnableC2660(2, c2014, c2246.f11087, false));
        }
    }

    /* JADX INFO: renamed from: ᛵᲀᲈᛴ, reason: contains not printable characters */
    public C2561 m4058(InputConnection inputConnection, EditorInfo editorInfo) {
        InputConnection inputConnection2;
        C0052 c0052 = (C0052) this.f10553;
        if (inputConnection == null) {
            inputConnection2 = null;
        } else {
            C2133 c2133 = (C2133) c0052.f551;
            if (!(inputConnection instanceof C2561)) {
                inputConnection = new C2561(editorInfo, inputConnection, (EditText) c2133.f10555);
            }
            inputConnection2 = inputConnection;
        }
        return (C2561) inputConnection2;
    }

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public void m4059() throws IOException {
        String str = (String) this.f10555;
        if (((FileChannel) this.f10553) != null) {
            return;
        }
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileChannel channel = new FileOutputStream(file).getChannel();
            this.f10553 = channel;
            if (channel != null) {
                channel.lock();
            }
        } catch (Throwable th) {
            FileChannel fileChannel = (FileChannel) this.f10553;
            if (fileChannel != null) {
                fileChannel.close();
            }
            this.f10553 = null;
            throw new IllegalStateException(AbstractC2104.m4014("Unable to lock file: '", str, "'."), th);
        }
    }

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ */
    public void mo2582(AttributeSet attributeSet, int i) {
        boolean z = true;
        switch (this.f10554) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.f10555;
                C0644 c0644M1535 = C0644.m1535(absSeekBar.getContext(), attributeSet, f10552, i);
                Drawable drawableM1564 = c0644M1535.m1564(0);
                if (drawableM1564 != null) {
                    if (drawableM1564 instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) drawableM1564;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i2 = 0; i2 < numberOfFrames; i2++) {
                            Drawable drawableM4050 = m4050(animationDrawable.getFrame(i2), true);
                            drawableM4050.setLevel(10000);
                            animationDrawable2.addFrame(drawableM4050, animationDrawable.getDuration(i2));
                        }
                        animationDrawable2.setLevel(10000);
                        drawableM1564 = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(drawableM1564);
                }
                Drawable drawableM15642 = c0644M1535.m1564(1);
                if (drawableM15642 != null) {
                    absSeekBar.setProgressDrawable(m4050(drawableM15642, false));
                }
                c0644M1535.m1568();
                return;
            default:
                TypedArray typedArrayObtainStyledAttributes = ((EditText) this.f10555).getContext().obtainStyledAttributes(attributeSet, AbstractC1592.f8091, i, 0);
                try {
                    if (typedArrayObtainStyledAttributes.hasValue(14)) {
                        z = typedArrayObtainStyledAttributes.getBoolean(14, true);
                        break;
                    }
                    typedArrayObtainStyledAttributes.recycle();
                    m4063(z);
                    return;
                } catch (Throwable th) {
                    typedArrayObtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public Object m4060(InterfaceC1490 interfaceC1490) {
        HashMap map = (HashMap) this.f10553;
        C1995 c1995 = (C1995) map.get(interfaceC1490);
        if (c1995 == null) {
            c1995 = new C1995(interfaceC1490);
            map.put(interfaceC1490, c1995);
        } else {
            interfaceC1490.mo968();
        }
        C1995 c19952 = c1995.f10005;
        c19952.f10004 = c1995.f10004;
        c1995.f10004.f10005 = c19952;
        C1995 c19953 = (C1995) this.f10555;
        c1995.f10005 = c19953;
        C1995 c19954 = c19953.f10004;
        c1995.f10004 = c19954;
        c19954.f10005 = c1995;
        c1995.f10005.f10004 = c1995;
        ArrayList arrayList = c1995.f10003;
        int size = arrayList != null ? arrayList.size() : 0;
        if (size > 0) {
            return c1995.f10003.remove(size - 1);
        }
        return null;
    }

    @Override // yyds.InterfaceC0097
    /* JADX INFO: renamed from: ᛷᛵᲇᲀ */
    public void mo399(C0488 c0488) {
        AbstractC2328.m4341(-999313908597614L);
        ((InterfaceC1549) this.f10553).mo371(c0488);
    }

    /* JADX INFO: renamed from: ᛷᛶᛷᲀ, reason: contains not printable characters */
    public void m4061(String str, int i, int i2, int i3, String str2, InterfaceC1549 interfaceC1549) {
        AbstractC2328.m4341(-1140274735252334L);
        AbstractC2328.m4341(-1140309094990702L);
        AbstractC2071.m3959((C2454) this.f10553, null, new C0141(i, i2, str2, str, this, i3, interfaceC1549, null), 3);
    }

    /* JADX INFO: renamed from: ᛷᛸᲇᛶ, reason: contains not printable characters */
    public void m4062(InterfaceC1490 interfaceC1490, Object obj) {
        HashMap map = (HashMap) this.f10553;
        C1995 c1995 = (C1995) map.get(interfaceC1490);
        if (c1995 == null) {
            c1995 = new C1995(interfaceC1490);
            c1995.f10005 = c1995;
            C1995 c19952 = (C1995) this.f10555;
            c1995.f10005 = c19952.f10005;
            c1995.f10004 = c19952;
            c19952.f10005 = c1995;
            c1995.f10005.f10004 = c1995;
            map.put(interfaceC1490, c1995);
        } else {
            interfaceC1490.mo968();
        }
        ArrayList arrayList = c1995.f10003;
        if (arrayList == null) {
            arrayList = new ArrayList();
            c1995.f10003 = arrayList;
        }
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: ᛷᲇᛲᛱ, reason: contains not printable characters */
    public void m4063(boolean z) {
        C0341 c0341 = (C0341) ((C2133) ((C0052) this.f10553).f551).f10553;
        if (c0341.f1785 != z) {
            if (c0341.f1787 != null) {
                C0331 c0331M1001 = C0331.m1001();
                C1980 c1980 = c0341.f1787;
                c0331M1001.getClass();
                AbstractC2217.m4200(c1980, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = c0331M1001.f1748;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    c0331M1001.f1749.remove(c1980);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            c0341.f1785 = z;
            if (z) {
                C0341.m1026(c0341.f1786, C0331.m1001().m1003());
            }
        }
    }

    /* JADX INFO: renamed from: ᛸᛸᛷᛱ, reason: contains not printable characters */
    public void m4064(Class cls, C1585 c1585) {
        LinkedList linkedList = (LinkedList) this.f10553;
        C0946 c0946 = new C0946();
        c0946.f4408 = cls;
        c0946.f4409 = c1585;
        linkedList.addLast(c0946);
    }

    /* JADX INFO: renamed from: ᲀᛲᛱᛱ, reason: contains not printable characters */
    public void m4065(String str) {
        C1412 c1412;
        synchronized (this) {
            try {
                c1412 = (C1412) ((HashMap) this.f10555).get(str);
                AbstractC0319.m992(c1412, "Argument must not be null");
                int i = c1412.f6685;
                if (i < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + c1412.f6685);
                }
                int i2 = i - 1;
                c1412.f6685 = i2;
                if (i2 == 0) {
                    C1412 c14122 = (C1412) ((HashMap) this.f10555).remove(str);
                    if (!c14122.equals(c1412)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + c1412 + ", but actually removed: " + c14122 + ", safeKey: " + str);
                    }
                    C0362 c0362 = (C0362) this.f10553;
                    synchronized (c0362.f1876) {
                        try {
                            if (c0362.f1876.size() < 10) {
                                c0362.f1876.offer(c14122);
                            }
                        } finally {
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        c1412.f6684.unlock();
    }

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public void m4066() {
        ((SparseIntArray) this.f10555).clear();
    }

    @Override // yyds.InterfaceC2295
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public InterfaceC1979 mo952() {
        return (C1688) this.f10555;
    }

    /* JADX INFO: renamed from: ᲀᛴᲁᲈ, reason: contains not printable characters */
    public Object m4067() {
        C1995 c1995 = (C1995) this.f10555;
        C1995 c19952 = c1995.f10005;
        while (true) {
            boolean zEquals = c19952.equals(c1995);
            Object obj = c19952.f10002;
            if (zEquals) {
                return null;
            }
            ArrayList arrayList = c19952.f10003;
            int size = arrayList != null ? arrayList.size() : 0;
            Object objRemove = size > 0 ? c19952.f10003.remove(size - 1) : null;
            if (objRemove != null) {
                return objRemove;
            }
            C1995 c19953 = c19952.f10005;
            c19953.f10004 = c19952.f10004;
            c19952.f10004.f10005 = c19953;
            ((HashMap) this.f10553).remove(obj);
            ((InterfaceC1490) obj).mo968();
            c19952 = c19952.f10005;
        }
    }

    @Override // yyds.InterfaceC2656
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public C2098 mo1278(C1369 c1369, C0837 c0837) {
        String str;
        Object obj;
        C2098 c2098 = c0837.f3858;
        if (c2098.f10391.m3306("Authorization") != null) {
            return null;
        }
        System.out.println("Authenticating for response: " + c0837);
        PrintStream printStream = System.out;
        StringBuilder sb = new StringBuilder("Challenges: ");
        C1605 c1605 = c0837.f3847;
        int i = c0837.f3860;
        if (i == 401) {
            str = "WWW-Authenticate";
        } else {
            if (i != 407) {
                obj = C1860.f9345;
                sb.append(obj);
                printStream.println(sb.toString());
                String str2 = (String) this.f10555;
                String str3 = (String) this.f10553;
                String strConcat = "Basic ".concat(new C2534((str2 + ':' + str3).getBytes(AbstractC0347.f1805)).mo4260());
                C1633 c1633M3994 = c2098.m3994();
                ((C2135) c1633M3994.f8331).m4070("Authorization", strConcat);
                return new C2098(c1633M3994);
            }
            str = "Proxy-Authenticate";
        }
        C2534 c2534 = AbstractC2191.f10761;
        ArrayList arrayList = new ArrayList();
        int size = c1605.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (str.equalsIgnoreCase(AbstractC0797.m1836(c1605, i2))) {
                C1507 c1507 = new C1507();
                c1507.m3019(AbstractC0797.m1817(c1605, i2));
                try {
                    AbstractC2191.m4184(c1507, arrayList);
                } catch (EOFException e) {
                    C1966 c1966 = AbstractC1325.f6087;
                    AbstractC1325.f6087.getClass();
                    Log.w("OkHttp", "Unable to parse challenge", e);
                }
            }
        }
        obj = arrayList;
        sb.append(obj);
        printStream.println(sb.toString());
        String str22 = (String) this.f10555;
        String str32 = (String) this.f10553;
        String strConcat2 = "Basic ".concat(new C2534((str22 + ':' + str32).getBytes(AbstractC0347.f1805)).mo4260());
        C1633 c1633M39942 = c2098.m3994();
        ((C2135) c1633M39942.f8331).m4070("Authorization", strConcat2);
        return new C2098(c1633M39942);
    }

    /* JADX INFO: renamed from: ᲈᛷᲈᛶ, reason: contains not printable characters */
    public void m4068(int i, int i2, int i3, int i4) {
        CardView cardView = (CardView) this.f10553;
        cardView.f253.set(i, i2, i3, i4);
        Rect rect = cardView.f250;
        super/*android.view.View*/.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
    }

    /* JADX INFO: renamed from: ᲈᲀᛲᲀ, reason: contains not printable characters */
    public boolean m4069(AbstractC0451 abstractC0451, Menu menu) {
        ViewGroup viewGroup = ((LayoutInflaterFactory2C2181) this.f10553).f10675;
        WeakHashMap weakHashMap = AbstractC1640.f8352;
        viewGroup.requestApplyInsets();
        C0299 c0299 = (C0299) this.f10555;
        ActionMode.Callback callback = (ActionMode.Callback) c0299.f1577;
        C1591 c1591M950 = c0299.m950(abstractC0451);
        C0988 c0988 = (C0988) c0299.f1576;
        Menu menuC1946 = (Menu) c0988.get(menu);
        if (menuC1946 == null) {
            menuC1946 = new MenuC1946((Context) c0299.f1573, (MenuC0836) menu);
            c0988.put(menu, menuC1946);
        }
        return callback.onPrepareActionMode(c1591M950, menuC1946);
    }

    public /* synthetic */ C2133(int i, boolean z) {
        this.f10554 = i;
    }

    public /* synthetic */ C2133(Object obj, int i, Object obj2) {
        this.f10554 = i;
        this.f10555 = obj;
        this.f10553 = obj2;
    }

    public C2133(Context context) {
        this.f10554 = 2;
        AbstractC2328.m4341(-1140034217083758L);
        this.f10555 = WardDatabase.f492.m1272(context).mo344();
        C1206 c1206 = AbstractC0221.f1238;
        this.f10553 = AbstractC1917.m3696(AbstractC0879.m1960(ExecutorC2482.f12272, AbstractC1741.m3466()));
    }

    public C2133(C0644 c0644) {
        this.f10554 = 28;
        C0644 c06442 = new C0644(c0644);
        this.f10553 = new C2794(3);
        this.f10555 = c06442;
    }

    public C2133(String str) {
        this.f10554 = 23;
        this.f10555 = str.concat(".lck");
    }

    public C2133(int i) {
        this.f10554 = i;
        switch (i) {
            case 19:
                this.f10555 = new HashMap();
                this.f10553 = new C0362(1);
                break;
            case 26:
                this.f10555 = new SparseIntArray();
                this.f10553 = new SparseIntArray();
                break;
            case 27:
                this.f10555 = new C1995(null);
                this.f10553 = new HashMap();
                break;
            case 29:
                this.f10555 = new AtomicReference();
                this.f10553 = new C1505(0);
                break;
            default:
                this.f10555 = new AtomicInteger(0);
                this.f10553 = new AtomicBoolean(false);
                break;
        }
    }

    public C2133(AbsSeekBar absSeekBar) {
        this.f10554 = 0;
        this.f10555 = absSeekBar;
    }

    public C2133(EditText editText, int i) {
        this.f10554 = i;
        switch (i) {
            case 20:
                this.f10555 = editText;
                C0341 c0341 = new C0341(editText);
                this.f10553 = c0341;
                editText.addTextChangedListener(c0341);
                if (C0712.f3356 == null) {
                    synchronized (C0712.f3355) {
                        try {
                            if (C0712.f3356 == null) {
                                C0712 c0712 = new C0712();
                                try {
                                    C0712.f3357 = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C0712.class.getClassLoader());
                                    break;
                                } catch (Throwable unused) {
                                }
                                C0712.f3356 = c0712;
                            }
                        } finally {
                        }
                        break;
                    }
                }
                editText.setEditableFactory(C0712.f3356);
                return;
            default:
                this.f10555 = editText;
                this.f10553 = new C0052(editText);
                return;
        }
    }

    public /* synthetic */ C2133(int i, Object obj, Object obj2, boolean z) {
        this.f10554 = i;
        this.f10553 = obj;
        this.f10555 = obj2;
    }

    public C2133(C0299 c0299, C1985 c1985, C2415 c2415) {
        this.f10554 = 21;
        this.f10555 = c0299;
        this.f10553 = c2415;
    }

    public C2133(C2115 c2115) {
        this.f10554 = 22;
        InterfaceC2121 interfaceC2121 = (InterfaceC2121) c2115.f10457;
        this.f10555 = new C1688(c2115, interfaceC2121.mo709().mo952(), -1L, true);
        this.f10553 = new C1770(c2115, interfaceC2121.mo709().getSource(), -1L, true);
    }

    public C2133(CardView cardView) {
        this.f10554 = 14;
        this.f10553 = cardView;
    }

    public C2133(C0580 c0580) {
        this.f10554 = 6;
        this.f10553 = c0580;
        this.f10555 = c0580;
    }
}
