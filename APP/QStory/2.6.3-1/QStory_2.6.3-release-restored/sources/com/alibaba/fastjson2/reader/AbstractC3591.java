package com.alibaba.fastjson2.reader;

import androidx.collection.C1123;
import androidx.profileinstaller.AbstractC3275;
import com.alibaba.fastjson2.AbstractC3732;
import com.alibaba.fastjson2.C3776;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC3682;
import com.alibaba.fastjson2.util.AbstractC3699;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3591 extends AbstractC3595 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final boolean f8751;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final InterfaceC3621 f8752;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final boolean f8753;

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC3591(String str, Type type, Class cls, int i, long j, String str2, Locale locale, Object obj, JSONSchema jSONSchema, Method method, Field field, InterfaceC3621 interfaceC3621) {
        boolean z;
        super(str, type, cls, i, j, str2, locale, obj, jSONSchema, method, field);
        this.f8752 = interfaceC3621;
        boolean z2 = false;
        if (str2 != null) {
            z = true;
            if (!str2.equals("millis")) {
                if (str2.equals("unixtime")) {
                    z = false;
                    z2 = true;
                } else {
                    z = false;
                }
            }
        }
        this.f8751 = z2;
        this.f8753 = z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public abstract void mo6035(Object obj);

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public abstract void mo6036(Object obj, Date date);

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public abstract void mo6037(Object obj, ZonedDateTime zonedDateTime);

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public abstract void mo6038(Object obj, LocalDateTime localDateTime);

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public abstract void mo6039(Object obj, Instant instant);

    @Override // com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public boolean mo6030(Class cls) {
        return cls == Date.class || cls == String.class;
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo6031(Object obj, Object obj2) {
        if (obj2 == null) {
            mo6035(obj);
            return;
        }
        if (obj2 instanceof String) {
            String str = (String) obj2;
            if (str.isEmpty() || "null".equals(str)) {
                mo6035(obj);
                return;
            }
            boolean z = this.f8751;
            String str2 = this.f8771;
            if ((str2 == null || z || this.f8753) && AbstractC3682.m6248(str)) {
                long j = Long.parseLong(str);
                if (z) {
                    j *= 1000;
                }
                mo6040(obj, j);
                return;
            }
            obj2 = AbstractC3699.m6432(str, str2, AbstractC3699.f9372);
        }
        if (obj2 instanceof Date) {
            mo6036(obj, (Date) obj2);
            return;
        }
        if (obj2 instanceof Instant) {
            mo6039(obj, (Instant) obj2);
            return;
        }
        if (obj2 instanceof Long) {
            mo6040(obj, ((Long) obj2).longValue());
            return;
        }
        if (obj2 instanceof LocalDateTime) {
            mo6038(obj, (LocalDateTime) obj2);
        } else if (obj2 instanceof ZonedDateTime) {
            mo6037(obj, (ZonedDateTime) obj2);
        } else {
            C1123.m1410(AbstractC3275.m5141(obj2, new StringBuilder("not support value ")));
        }
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final Object mo6033(AbstractC3732 abstractC3732) {
        return this.f8752.mo6023(abstractC3732, this.f8768, this.f8773, this.f8767);
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final InterfaceC3621 mo6055(AbstractC3732 abstractC3732) {
        return this.f8752;
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final InterfaceC3621 mo6056(C3776 c3776) {
        return this.f8752;
    }
}
