.class public final Lc2;
.super Landroid/app/Dialog;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc2$a;
    }
.end annotation


# static fields
.field public static final j:Lc2$a;

.field public static final k:I

.field private static final l:Lu60;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lu60;"
        }
    .end annotation
.end field

.field private static final m:Lu60;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lu60;"
        }
    .end annotation
.end field

.field public static final n:Ljava/lang/String; = "\u6211\u5df2\u77e5\u6653\u98ce\u9669\u5e76\u627f\u8bfa\u4ec5\u7528\u4e8e\u4e2a\u4eba\u5b66\u4e60\u4e1424\u5c0f\u65f6\u5185\u5220\u9664\uff0c\u5e76\u627f\u8bfa\u9075\u5b88\u4e0a\u8ff0\u884c\u4e3a\u7ea2\u7ebf\u4e0e\u7981\u6b62\u6761\u6b3e\uff0c\u5426\u5219\u81ea\u613f\u627f\u62c5\u4e00\u5207\u6cd5\u5f8b\u540e\u679c"

.field private static o:Z


# instance fields
.field private final d:Ljava/lang/String;

.field private e:Landroid/widget/Button;

.field private f:I

.field private g:Z

.field private h:Z

.field private final i:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lc2$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lc2$a;-><init>(Lpl;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lc2;->j:Lc2$a;

    .line 8
    .line 9
    const/16 v0, 0x8

    .line 10
    .line 11
    sput v0, Lc2;->k:I

    .line 12
    .line 13
    new-instance v0, La2;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-direct {v0, v1}, La2;-><init>(I)V

    .line 17
    .line 18
    .line 19
    new-instance v1, Lx51;

    .line 20
    .line 21
    invoke-direct {v1, v0}, Lx51;-><init>(Lhw;)V

    .line 22
    .line 23
    .line 24
    sput-object v1, Lc2;->l:Lu60;

    .line 25
    .line 26
    new-instance v0, La2;

    .line 27
    .line 28
    const/4 v1, 0x1

    .line 29
    invoke-direct {v0, v1}, La2;-><init>(I)V

    .line 30
    .line 31
    .line 32
    new-instance v1, Lx51;

    .line 33
    .line 34
    invoke-direct {v1, v0}, Lx51;-><init>(Lhw;)V

    .line 35
    .line 36
    .line 37
    sput-object v1, Lc2;->m:Lu60;

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const v0, 0x103000a

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p1, v0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 8
    .line 9
    .line 10
    const-string p1, "\u6b22\u8fce\u4f7f\u7528\u672c\u6a21\u5757 \n     \n \u5728\u5b89\u88c5\u548c\u4f7f\u7528\u672c\u6a21\u5757\u4e4b\u524d\uff0c\u8bf7\u52a1\u5fc5\u5ba1\u614e\u9605\u8bfb\u3001\u5145\u5206\u7406\u89e3\u4ee5\u4e0b\u6761\u6b3e\u3002\u4e00\u65e6\u60a8\u7ee7\u7eed\u4f7f\u7528\uff0c\u5373\u89c6\u4e3a\u60a8\u5df2\u5b8c\u5168\u540c\u610f\u672c\u534f\u8bae\u7684\u5168\u90e8\u5185\u5bb9\u3002 \n \n \u4e00\u3001\u6a21\u5757\u6027\u8d28\u4e0e\u7528\u9014\u58f0\u660e \n \n 1. \u672c\u6a21\u5757\u4e3a\u57fa\u4e8e\u4e92\u8054\u7f51\u7cbe\u795e\u514d\u8d39\u5206\u4eab\u7684\u975e\u5546\u4e1a\u6027\u4e2a\u4eba\u6280\u672f\u7814\u7a76\u4f5c\u54c1\u3002 \n \n 2. \u672c\u6a21\u5757\u4ec5\u4f9b\u4e2a\u4eba\u5b66\u4e60 Android \u7cfb\u7edf\u67b6\u6784\u3001\u7814\u7a76 Hook \u6280\u672f\u53ca\u8fdb\u884c\u5b89\u5168\u6d4b\u8bd5\u4f7f\u7528\u3002 \n \n 3. \u5f00\u53d1\u8005\u4e0d\u5bf9\u672c\u6a21\u5757\u63d0\u4f9b\u4efb\u4f55\u5f62\u5f0f\u7684\u5546\u4e1a\u6280\u672f\u652f\u6301\u548c\u7ef4\u62a4\u627f\u8bfa\u3002 \n \n \u4e8c\u3001\u514d\u8d23\u6761\u6b3e \n \n 1. \u8bbe\u5907\u4e0e\u6570\u636e\u5b89\u5168\uff1a\u672c\u6a21\u5757\u6d89\u53ca\u7cfb\u7edf\u5e95\u5c42\u7684\u4fee\u6539\uff0c\u53ef\u80fd\u5bfc\u81f4\u8bbe\u5907\u53d8\u7816\u3001\u65e0\u9650\u91cd\u542f\u3001\u6570\u636e\u4e22\u5931\u7b49\u4e0d\u53ef\u9884\u77e5\u7684\u98ce\u9669\u3002\u7528\u6237\u987b\u81ea\u884c\u627f\u62c5\u4f7f\u7528\u672c\u6a21\u5757\u5e26\u6765\u7684\u4e00\u5207\u8f6f\u786c\u4ef6\u6545\u969c\u98ce\u9669\uff0c\u5f00\u53d1\u8005\u6982\u4e0d\u8d1f\u8d23\u3002 \n \n 2. \u8d26\u53f7\u4e0e\u7b2c\u4e09\u65b9\u98ce\u9669\uff1a\u82e5\u7528\u6237\u5c06\u672c\u6a21\u5757\u4f5c\u7528\u4e8e\u4efb\u4f55\u7b2c\u4e09\u65b9\u5e94\u7528\u7a0b\u5e8f\uff0c\u7531\u6b64\u5f15\u53d1\u7684\u7b2c\u4e09\u65b9\u5e94\u7528\u62a5\u9519\u3001\u529f\u80fd\u5f02\u5e38\u6216\u8d26\u53f7\u88ab\u5c01\u7981\u7b49\u540e\u679c\uff0c\u7531\u7528\u6237\u81ea\u884c\u627f\u62c5\u3002 \n \n 3. \u6cd5\u5f8b\u8d23\u4efb\uff1a\u7528\u6237\u5728\u4f7f\u7528\u672c\u6a21\u5757\u65f6\u4ea7\u751f\u7684\u6240\u6709\u884c\u4e3a\u53ca\u540e\u679c\u5747\u7531\u7528\u6237\u81ea\u884c\u8d1f\u8d23\u3002\u5f00\u53d1\u8005\u4e0d\u627f\u62c5\u4efb\u4f55\u56e0\u7528\u6237\u4e0d\u5f53\u4f7f\u7528\u800c\u5bfc\u81f4\u7684\u76f4\u63a5\u6216\u95f4\u63a5\u6cd5\u5f8b\u8d23\u4efb\u3002 \n \n \u4e09\u3001\u884c\u4e3a\u7ea2\u7ebf\u4e0e\u7981\u6b62\u6761\u6b3e \n \n 1. \u4e25\u7981\u5546\u4e1a\u5316\u4e0e\u5012\u5356\uff1a\u672c\u6a21\u5757\u6c38\u4e45\u514d\u8d39\u3002\u4e25\u7981\u4efb\u4f55\u4eba\u5c06\u5176\u7528\u4e8e\u4efb\u4f55\u5f62\u5f0f\u7684\u5546\u4e1a\u76c8\u5229\uff08\u5305\u62ec\u4f46\u4e0d\u9650\u4e8e\u6253\u5305\u552e\u5356\u3001\u4ed8\u8d39\u8fdb\u7fa4\u3001\u5f15\u6d41\u53d8\u73b0\u7b49\uff09\u3002\u5982\u60a8\u5728\u95f2\u9c7c\u3001\u6dd8\u5b9d\u3001\u9177\u5b89\u7b49\u5e73\u53f0\u4ed8\u8d39\u83b7\u53d6\u4e86\u672c\u6a21\u5757\uff0c\u8bf7\u7acb\u5373\u9000\u6b3e\u5e76\u4e3e\u62a5\u3002 \n \n 2. \u4e25\u7981\u9ed1\u7070\u4ea7\u53ca\u7834\u574f\u884c\u4e3a\uff1a\u4e25\u7981\u5c06\u672c\u6a21\u5757\u7528\u4e8e\u4efb\u4f55\u8fdd\u6cd5\u8fdd\u89c4\u7528\u9014\uff01\u5305\u62ec\u4f46\u4e0d\u9650\u4e8e\uff1a\u7be1\u6539\u6216\u7834\u574f\u5176\u4ed6\u5546\u4e1a\u8f6f\u4ef6\u7684\u6b63\u5e38\u8fd0\u884c\uff08\u5982\u7834\u89e3\u4ed8\u8d39\u5899\u3001\u62e6\u622a\u5408\u6cd5\u5e7f\u544a\u7b49\u635f\u5bb3\u5f00\u53d1\u8005\u5229\u76ca\u7684\u884c\u4e3a\uff09\u3001\u7a83\u53d6\u7528\u6237\u9690\u79c1\u6570\u636e\u3001\u5f00\u53d1\u5916\u6302\u811a\u672c\u7b49\u3002 \n \n 3. \u9650\u5236\u4f20\u64ad\uff1a\u4e3a\u907f\u514d\u6280\u672f\u88ab\u6ee5\u7528\uff0c\u8bf7\u52ff\u5c06\u672c\u6a21\u5757\u968f\u610f\u5206\u53d1\u81f3\u672a\u7ecf\u5ba1\u6838\u7684\u516c\u5f00\u5e73\u53f0\uff0c\u5305\u62ec\u4f46\u4e0d\u9650\u4e8e\u95f2\u9c7c\u3001\u9177\u5b89\u3001\u6296\u97f3\u3001\u5feb\u624b\u3001\u5fae\u4fe1\u3001QQ\u3001B\u7ad9\u3001\u5fae\u535a\u7b49\u3002 \n \n \u56db\u3001\u77e5\u8bc6\u4ea7\u6743\u4e0e\u5220\u9664\u4e49\u52a1 \n \n 1. \u6839\u636e\u300a\u8457\u4f5c\u6743\u6cd5\u300b\u5173\u4e8e\u4e2a\u4eba\u5b66\u4e60\u7814\u7a76\u7684\u5408\u7406\u4f7f\u7528\u8303\u7574\uff0c\u8bf7\u60a8\u5728\u4e0b\u8f7d\u6d4b\u8bd5\u672c\u6a21\u5757\u540e\u768424 \u5c0f\u65f6\u5185\u5c06\u5176\u4ece\u60a8\u7684\u8bbe\u5907\u4e2d\u5f7b\u5e95\u5220\u9664\u3002 \n \n 2. \u82e5\u672c\u6a21\u5757\u7684\u4efb\u4f55\u529f\u80fd\u65e0\u610f\u4e2d\u4fb5\u72af\u4e86\u60a8\u7684\u5408\u6cd5\u6743\u76ca\uff0c\u8bf7\u8054\u7cfb\u5f00\u53d1\u8005\uff0c\u6211\u4eec\u5c06\u7acb\u5373\u505c\u6b62\u63d0\u4f9b\u5e76\u5220\u9664\u76f8\u5173\u4ee3\u7801\u3002"

    .line 11
    .line 12
    iput-object p1, p0, Lc2;->d:Ljava/lang/String;

    .line 13
    .line 14
    const/16 p1, 0x1e

    .line 15
    .line 16
    iput p1, p0, Lc2;->f:I

    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    iput-boolean p1, p0, Lc2;->g:Z

    .line 20
    .line 21
    new-instance p1, Landroid/os/Handler;

    .line 22
    .line 23
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lc2;->i:Landroid/os/Handler;

    .line 31
    .line 32
    const/4 p1, 0x0

    .line 33
    invoke-virtual {p0, p1}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 34
    .line 35
    .line 36
    invoke-direct {p0}, Lc2;->r()V

    .line 37
    .line 38
    .line 39
    invoke-direct {p0}, Lc2;->K()V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method private final A()I
    .locals 1

    .line 1
    invoke-direct {p0}, Lc2;->w()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/16 v0, 0x78

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    const/16 p0, 0xff

    .line 10
    .line 11
    :goto_0
    invoke-static {v0, p0, p0, p0}, Landroid/graphics/Color;->argb(IIII)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    goto :goto_0
.end method

.method private final B()I
    .locals 1

    .line 1
    invoke-direct {p0}, Lc2;->w()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/16 p0, 0x28

    .line 8
    .line 9
    const/16 v0, 0xff

    .line 10
    .line 11
    :goto_0
    invoke-static {p0, v0, v0, v0}, Landroid/graphics/Color;->argb(IIII)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_0
    const/16 p0, 0x1e

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    goto :goto_0
.end method

.method private final C()I
    .locals 1

    .line 1
    invoke-direct {p0}, Lc2;->w()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/16 p0, 0x3c

    .line 8
    .line 9
    const/16 v0, 0xff

    .line 10
    .line 11
    :goto_0
    invoke-static {p0, v0, v0, v0}, Landroid/graphics/Color;->argb(IIII)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_0
    const/16 p0, 0xa

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    goto :goto_0
.end method

.method private final D()I
    .locals 1

    .line 1
    invoke-direct {p0}, Lc2;->w()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/16 p0, 0x64

    .line 8
    .line 9
    const/16 v0, 0xff

    .line 10
    .line 11
    :goto_0
    invoke-static {p0, v0, v0, v0}, Landroid/graphics/Color;->argb(IIII)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_0
    const/16 p0, 0x32

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    goto :goto_0
.end method

.method private final E()I
    .locals 0

    .line 1
    const-string p0, "#FE2C55"

    .line 2
    .line 3
    invoke-static {p0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method private final F()I
    .locals 1

    .line 1
    invoke-direct {p0}, Lc2;->w()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/16 v0, 0x50

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    const/16 p0, 0xff

    .line 10
    .line 11
    :goto_0
    invoke-static {v0, p0, p0, p0}, Landroid/graphics/Color;->argb(IIII)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    goto :goto_0
.end method

.method private final G()I
    .locals 1

    .line 1
    invoke-direct {p0}, Lc2;->w()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/4 p0, -0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/16 p0, 0xff

    .line 10
    .line 11
    const/16 v0, 0x1a

    .line 12
    .line 13
    invoke-static {p0, v0, v0, v0}, Landroid/graphics/Color;->argb(IIII)I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0
.end method

.method private final H()I
    .locals 1

    .line 1
    invoke-direct {p0}, Lc2;->w()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/16 v0, 0x96

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    const/16 p0, 0xff

    .line 10
    .line 11
    :goto_0
    invoke-static {v0, p0, p0, p0}, Landroid/graphics/Color;->argb(IIII)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    goto :goto_0
.end method

.method private final I()I
    .locals 1

    .line 1
    invoke-direct {p0}, Lc2;->w()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/16 v0, 0xc8

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    const/16 p0, 0xff

    .line 10
    .line 11
    :goto_0
    invoke-static {v0, p0, p0, p0}, Landroid/graphics/Color;->argb(IIII)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    goto :goto_0
.end method

.method private final J()V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lc2;->g:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    iget-boolean v0, p0, Lc2;->h:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move v0, v1

    .line 13
    :goto_0
    iget-object v2, p0, Lc2;->e:Landroid/widget/Button;

    .line 14
    .line 15
    if-eqz v2, :cond_5

    .line 16
    .line 17
    invoke-virtual {v2, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 18
    .line 19
    .line 20
    iget-boolean v3, p0, Lc2;->g:Z

    .line 21
    .line 22
    if-nez v3, :cond_2

    .line 23
    .line 24
    iget-boolean v3, p0, Lc2;->h:Z

    .line 25
    .line 26
    if-eqz v3, :cond_1

    .line 27
    .line 28
    const-string v3, "\u540c\u610f\u5e76\u8fdb\u884c\u6d4b\u8bd5"

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    const-string v3, "\u8bf7\u5148\u7c98\u8d34\u627f\u8bfa\u5185\u5bb9"

    .line 32
    .line 33
    :goto_1
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 34
    .line 35
    .line 36
    :cond_2
    if-eqz v0, :cond_3

    .line 37
    .line 38
    const/4 v3, -0x1

    .line 39
    goto :goto_2

    .line 40
    :cond_3
    invoke-direct {p0}, Lc2;->A()I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    :goto_2
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 45
    .line 46
    .line 47
    new-instance v3, Landroid/graphics/drawable/GradientDrawable;

    .line 48
    .line 49
    invoke-direct {v3}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v3, v1}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 53
    .line 54
    .line 55
    const/16 v1, 0x20

    .line 56
    .line 57
    invoke-direct {p0, v1}, Lc2;->u(I)I

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    int-to-float p0, p0

    .line 62
    invoke-virtual {v3, p0}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 63
    .line 64
    .line 65
    const/16 p0, 0x55

    .line 66
    .line 67
    const/16 v1, 0x2c

    .line 68
    .line 69
    const/16 v4, 0xfe

    .line 70
    .line 71
    if-eqz v0, :cond_4

    .line 72
    .line 73
    const/16 v0, 0xdc

    .line 74
    .line 75
    :goto_3
    invoke-static {v0, v4, v1, p0}, Landroid/graphics/Color;->argb(IIII)I

    .line 76
    .line 77
    .line 78
    move-result p0

    .line 79
    goto :goto_4

    .line 80
    :cond_4
    const/16 v0, 0x64

    .line 81
    .line 82
    goto :goto_3

    .line 83
    :goto_4
    invoke-virtual {v3, p0}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v2, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 87
    .line 88
    .line 89
    :cond_5
    return-void
.end method

.method private final K()V
    .locals 1

    .line 1
    new-instance v0, Lc2$c;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lc2$c;-><init>(Lc2;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lc2;->i:Landroid/os/Handler;

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public static synthetic a()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lc2;->e()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic b(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lc2;->s(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic c(Landroid/widget/Button;Lc2;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lc2;->t(Landroid/widget/Button;Lc2;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic d()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lc2;->f()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private static final e()Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Lik0;->a:Lik0;

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    new-array v1, v1, [I

    .line 5
    .line 6
    fill-array-data v1, :array_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lik0;->a([I)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0

    .line 14
    nop

    .line 15
    :array_0
    .array-data 4
        0x2a
        0x1f
        0x2
        0x54
        0x2e
        0x1c
    .end array-data
.end method

.method private static final f()Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Lik0;->a:Lik0;

    .line 2
    .line 3
    const/16 v1, 0xd

    .line 4
    .line 5
    new-array v1, v1, [I

    .line 6
    .line 7
    fill-array-data v1, :array_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lik0;->a([I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0

    .line 15
    :array_0
    .array-data 4
        0x33
        0x8
        0x41
        0x6e
        0x2a
        0x1f
        0x2
        0x54
        0x2e
        0x15
        0x15
        0x5f
        0x3f
    .end array-data
.end method

.method public static final synthetic g(Lc2;)Landroid/widget/Button;
    .locals 0

    .line 1
    iget-object p0, p0, Lc2;->e:Landroid/widget/Button;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic h(Lc2;)Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, Lc2;->i:Landroid/os/Handler;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic i(Lc2;)I
    .locals 0

    .line 1
    iget p0, p0, Lc2;->f:I

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic j()Lu60;
    .locals 1

    .line 1
    sget-object v0, Lc2;->m:Lu60;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic k()Lu60;
    .locals 1

    .line 1
    sget-object v0, Lc2;->l:Lu60;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic l()Z
    .locals 1

    .line 1
    sget-boolean v0, Lc2;->o:Z

    .line 2
    .line 3
    return v0
.end method

.method public static final synthetic m(Lc2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lc2;->J()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic n(Lc2;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lc2;->g:Z

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic o(Lc2;I)V
    .locals 0

    .line 1
    iput p1, p0, Lc2;->f:I

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic p(Z)V
    .locals 0

    .line 1
    sput-boolean p0, Lc2;->o:Z

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic q(Lc2;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lc2;->h:Z

    .line 2
    .line 3
    return-void
.end method

.method private final r()V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Landroid/widget/LinearLayout;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-direct {v1, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 10
    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 14
    .line 15
    .line 16
    invoke-direct {v0}, Lc2;->x()I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    invoke-virtual {v1, v3}, Landroid/view/View;->setBackgroundColor(I)V

    .line 21
    .line 22
    .line 23
    const/16 v3, 0x14

    .line 24
    .line 25
    invoke-direct {v0, v3}, Lc2;->u(I)I

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    const/16 v5, 0x1c

    .line 30
    .line 31
    invoke-direct {v0, v5}, Lc2;->u(I)I

    .line 32
    .line 33
    .line 34
    move-result v6

    .line 35
    invoke-direct {v0, v3}, Lc2;->u(I)I

    .line 36
    .line 37
    .line 38
    move-result v7

    .line 39
    const/16 v8, 0x10

    .line 40
    .line 41
    invoke-direct {v0, v8}, Lc2;->u(I)I

    .line 42
    .line 43
    .line 44
    move-result v9

    .line 45
    invoke-virtual {v1, v4, v6, v7, v9}, Landroid/view/View;->setPadding(IIII)V

    .line 46
    .line 47
    .line 48
    new-instance v4, Landroid/view/ViewGroup$LayoutParams;

    .line 49
    .line 50
    const/4 v6, -0x1

    .line 51
    invoke-direct {v4, v6, v6}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 55
    .line 56
    .line 57
    new-instance v4, Landroid/widget/LinearLayout;

    .line 58
    .line 59
    invoke-virtual {v0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 60
    .line 61
    .line 62
    move-result-object v7

    .line 63
    invoke-direct {v4, v7}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 64
    .line 65
    .line 66
    const/4 v7, 0x0

    .line 67
    invoke-virtual {v4, v7}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 68
    .line 69
    .line 70
    const/16 v9, 0x11

    .line 71
    .line 72
    invoke-virtual {v4, v9}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 73
    .line 74
    .line 75
    const/4 v10, 0x4

    .line 76
    invoke-direct {v0, v10}, Lc2;->u(I)I

    .line 77
    .line 78
    .line 79
    move-result v11

    .line 80
    invoke-virtual {v4, v7, v7, v7, v11}, Landroid/view/View;->setPadding(IIII)V

    .line 81
    .line 82
    .line 83
    new-instance v11, Landroid/widget/TextView;

    .line 84
    .line 85
    invoke-virtual {v0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 86
    .line 87
    .line 88
    move-result-object v12

    .line 89
    invoke-direct {v11, v12}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 90
    .line 91
    .line 92
    const-string v12, "\u6316\u7ea2\u85af\u5440-WHS"

    .line 93
    .line 94
    invoke-virtual {v11, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 95
    .line 96
    .line 97
    const/high16 v12, 0x41b00000    # 22.0f

    .line 98
    .line 99
    invoke-virtual {v11, v12}, Landroid/widget/TextView;->setTextSize(F)V

    .line 100
    .line 101
    .line 102
    invoke-direct {v0}, Lc2;->G()I

    .line 103
    .line 104
    .line 105
    move-result v12

    .line 106
    invoke-virtual {v11, v12}, Landroid/widget/TextView;->setTextColor(I)V

    .line 107
    .line 108
    .line 109
    sget-object v12, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 110
    .line 111
    invoke-virtual {v11, v12}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v4, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 115
    .line 116
    .line 117
    new-instance v11, Landroid/widget/TextView;

    .line 118
    .line 119
    invoke-virtual {v0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 120
    .line 121
    .line 122
    move-result-object v13

    .line 123
    invoke-direct {v11, v13}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 124
    .line 125
    .line 126
    const-string v13, "3.0"

    .line 127
    .line 128
    invoke-virtual {v11, v13}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 129
    .line 130
    .line 131
    const/high16 v13, 0x41500000    # 13.0f

    .line 132
    .line 133
    invoke-virtual {v11, v13}, Landroid/widget/TextView;->setTextSize(F)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v11, v6}, Landroid/widget/TextView;->setTextColor(I)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v11, v12}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v11, v9}, Landroid/widget/TextView;->setGravity(I)V

    .line 143
    .line 144
    .line 145
    new-instance v14, Landroid/graphics/drawable/GradientDrawable;

    .line 146
    .line 147
    invoke-direct {v14}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v14, v7}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 151
    .line 152
    .line 153
    invoke-direct {v0, v10}, Lc2;->u(I)I

    .line 154
    .line 155
    .line 156
    move-result v15

    .line 157
    int-to-float v15, v15

    .line 158
    invoke-virtual {v14, v15}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 159
    .line 160
    .line 161
    const/16 v15, 0x96

    .line 162
    .line 163
    const/16 v5, 0xf3

    .line 164
    .line 165
    const/16 v3, 0xff

    .line 166
    .line 167
    const/16 v10, 0x21

    .line 168
    .line 169
    invoke-static {v3, v10, v15, v5}, Landroid/graphics/Color;->argb(IIII)I

    .line 170
    .line 171
    .line 172
    move-result v3

    .line 173
    invoke-virtual {v14, v3}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v11, v14}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 177
    .line 178
    .line 179
    const/16 v3, 0x8

    .line 180
    .line 181
    invoke-direct {v0, v3}, Lc2;->u(I)I

    .line 182
    .line 183
    .line 184
    move-result v5

    .line 185
    const/4 v10, 0x3

    .line 186
    invoke-direct {v0, v10}, Lc2;->u(I)I

    .line 187
    .line 188
    .line 189
    move-result v14

    .line 190
    invoke-direct {v0, v3}, Lc2;->u(I)I

    .line 191
    .line 192
    .line 193
    move-result v15

    .line 194
    invoke-direct {v0, v10}, Lc2;->u(I)I

    .line 195
    .line 196
    .line 197
    move-result v10

    .line 198
    invoke-virtual {v11, v5, v14, v15, v10}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 199
    .line 200
    .line 201
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 202
    .line 203
    const/4 v10, -0x2

    .line 204
    invoke-direct {v5, v10, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 205
    .line 206
    .line 207
    invoke-direct {v0, v3}, Lc2;->u(I)I

    .line 208
    .line 209
    .line 210
    move-result v14

    .line 211
    invoke-virtual {v5, v14, v7, v7, v7}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v11, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v4, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v1, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 221
    .line 222
    .line 223
    new-instance v4, Landroid/widget/TextView;

    .line 224
    .line 225
    invoke-virtual {v0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 226
    .line 227
    .line 228
    move-result-object v5

    .line 229
    invoke-direct {v4, v5}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 230
    .line 231
    .line 232
    const-string v5, "\u4f7f\u7528\u534f\u8bae"

    .line 233
    .line 234
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 235
    .line 236
    .line 237
    const/high16 v5, 0x41800000    # 16.0f

    .line 238
    .line 239
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTextSize(F)V

    .line 240
    .line 241
    .line 242
    invoke-direct {v0}, Lc2;->H()I

    .line 243
    .line 244
    .line 245
    move-result v5

    .line 246
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {v4, v9}, Landroid/widget/TextView;->setGravity(I)V

    .line 250
    .line 251
    .line 252
    invoke-direct {v0, v8}, Lc2;->u(I)I

    .line 253
    .line 254
    .line 255
    move-result v5

    .line 256
    invoke-virtual {v4, v7, v7, v7, v5}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v1, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 260
    .line 261
    .line 262
    new-instance v4, Landroid/widget/LinearLayout;

    .line 263
    .line 264
    invoke-virtual {v0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 265
    .line 266
    .line 267
    move-result-object v5

    .line 268
    invoke-direct {v4, v5}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {v4, v2}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 272
    .line 273
    .line 274
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 275
    .line 276
    const/high16 v8, 0x3f800000    # 1.0f

    .line 277
    .line 278
    invoke-direct {v5, v6, v7, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v4, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 282
    .line 283
    .line 284
    new-instance v5, Landroid/graphics/drawable/GradientDrawable;

    .line 285
    .line 286
    invoke-direct {v5}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 287
    .line 288
    .line 289
    invoke-virtual {v5, v7}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 290
    .line 291
    .line 292
    const/16 v9, 0xc

    .line 293
    .line 294
    invoke-direct {v0, v9}, Lc2;->u(I)I

    .line 295
    .line 296
    .line 297
    move-result v11

    .line 298
    int-to-float v11, v11

    .line 299
    invoke-virtual {v5, v11}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 300
    .line 301
    .line 302
    invoke-direct {v0}, Lc2;->C()I

    .line 303
    .line 304
    .line 305
    move-result v11

    .line 306
    invoke-virtual {v5, v11}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 307
    .line 308
    .line 309
    invoke-virtual {v4, v5}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 310
    .line 311
    .line 312
    const/16 v5, 0xa

    .line 313
    .line 314
    invoke-direct {v0, v5}, Lc2;->u(I)I

    .line 315
    .line 316
    .line 317
    move-result v11

    .line 318
    invoke-direct {v0, v3}, Lc2;->u(I)I

    .line 319
    .line 320
    .line 321
    move-result v14

    .line 322
    invoke-direct {v0, v5}, Lc2;->u(I)I

    .line 323
    .line 324
    .line 325
    move-result v15

    .line 326
    invoke-direct {v0, v3}, Lc2;->u(I)I

    .line 327
    .line 328
    .line 329
    move-result v10

    .line 330
    invoke-virtual {v4, v11, v14, v15, v10}, Landroid/view/View;->setPadding(IIII)V

    .line 331
    .line 332
    .line 333
    new-instance v10, Landroid/widget/ScrollView;

    .line 334
    .line 335
    invoke-virtual {v0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 336
    .line 337
    .line 338
    move-result-object v11

    .line 339
    invoke-direct {v10, v11}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    .line 340
    .line 341
    .line 342
    new-instance v11, Landroid/widget/LinearLayout$LayoutParams;

    .line 343
    .line 344
    invoke-direct {v11, v6, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 345
    .line 346
    .line 347
    invoke-virtual {v10, v11}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 348
    .line 349
    .line 350
    new-instance v11, Landroid/widget/TextView;

    .line 351
    .line 352
    invoke-virtual {v0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 353
    .line 354
    .line 355
    move-result-object v14

    .line 356
    invoke-direct {v11, v14}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 357
    .line 358
    .line 359
    iget-object v14, v0, Lc2;->d:Ljava/lang/String;

    .line 360
    .line 361
    invoke-direct {v0, v14}, Lc2;->v(Ljava/lang/String;)Landroid/text/Spanned;

    .line 362
    .line 363
    .line 364
    move-result-object v14

    .line 365
    invoke-virtual {v11, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 366
    .line 367
    .line 368
    invoke-virtual {v11, v13}, Landroid/widget/TextView;->setTextSize(F)V

    .line 369
    .line 370
    .line 371
    invoke-direct {v0}, Lc2;->I()I

    .line 372
    .line 373
    .line 374
    move-result v13

    .line 375
    invoke-virtual {v11, v13}, Landroid/widget/TextView;->setTextColor(I)V

    .line 376
    .line 377
    .line 378
    const/4 v13, 0x2

    .line 379
    invoke-direct {v0, v13}, Lc2;->u(I)I

    .line 380
    .line 381
    .line 382
    move-result v14

    .line 383
    int-to-float v14, v14

    .line 384
    invoke-virtual {v11, v14, v8}, Landroid/widget/TextView;->setLineSpacing(FF)V

    .line 385
    .line 386
    .line 387
    const/4 v14, 0x4

    .line 388
    invoke-direct {v0, v14}, Lc2;->u(I)I

    .line 389
    .line 390
    .line 391
    move-result v15

    .line 392
    invoke-direct {v0, v14}, Lc2;->u(I)I

    .line 393
    .line 394
    .line 395
    move-result v8

    .line 396
    invoke-direct {v0, v3}, Lc2;->u(I)I

    .line 397
    .line 398
    .line 399
    move-result v14

    .line 400
    invoke-virtual {v11, v15, v7, v8, v14}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 401
    .line 402
    .line 403
    invoke-virtual {v10, v11}, Landroid/widget/ScrollView;->addView(Landroid/view/View;)V

    .line 404
    .line 405
    .line 406
    invoke-virtual {v4, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 407
    .line 408
    .line 409
    invoke-virtual {v1, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 410
    .line 411
    .line 412
    new-instance v4, Landroid/view/View;

    .line 413
    .line 414
    invoke-virtual {v0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 415
    .line 416
    .line 417
    move-result-object v8

    .line 418
    invoke-direct {v4, v8}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 419
    .line 420
    .line 421
    invoke-direct {v0}, Lc2;->B()I

    .line 422
    .line 423
    .line 424
    move-result v8

    .line 425
    invoke-virtual {v4, v8}, Landroid/view/View;->setBackgroundColor(I)V

    .line 426
    .line 427
    .line 428
    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    .line 429
    .line 430
    invoke-direct {v0, v2}, Lc2;->u(I)I

    .line 431
    .line 432
    .line 433
    move-result v10

    .line 434
    invoke-direct {v8, v6, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 435
    .line 436
    .line 437
    invoke-direct {v0, v5}, Lc2;->u(I)I

    .line 438
    .line 439
    .line 440
    move-result v10

    .line 441
    invoke-direct {v0, v5}, Lc2;->u(I)I

    .line 442
    .line 443
    .line 444
    move-result v11

    .line 445
    invoke-virtual {v8, v7, v10, v7, v11}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 446
    .line 447
    .line 448
    invoke-virtual {v4, v8}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 449
    .line 450
    .line 451
    invoke-virtual {v1, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 452
    .line 453
    .line 454
    new-instance v4, Landroid/widget/TextView;

    .line 455
    .line 456
    invoke-virtual {v0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 457
    .line 458
    .line 459
    move-result-object v8

    .line 460
    invoke-direct {v4, v8}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 461
    .line 462
    .line 463
    const-string v8, "\u6211\u5df2\u77e5\u6653\u98ce\u9669\u5e76\u627f\u8bfa\u4ec5\u7528\u4e8e\u4e2a\u4eba\u5b66\u4e60\u4e1424\u5c0f\u65f6\u5185\u5220\u9664\uff0c\u5e76\u627f\u8bfa\u9075\u5b88\u4e0a\u8ff0\u884c\u4e3a\u7ea2\u7ebf\u4e0e\u7981\u6b62\u6761\u6b3e\uff0c\u5426\u5219\u81ea\u613f\u627f\u62c5\u4e00\u5207\u6cd5\u5f8b\u540e\u679c"

    .line 464
    .line 465
    invoke-virtual {v4, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 466
    .line 467
    .line 468
    const/high16 v8, 0x41400000    # 12.0f

    .line 469
    .line 470
    invoke-virtual {v4, v8}, Landroid/widget/TextView;->setTextSize(F)V

    .line 471
    .line 472
    .line 473
    invoke-direct {v0}, Lc2;->E()I

    .line 474
    .line 475
    .line 476
    move-result v10

    .line 477
    invoke-virtual {v4, v10}, Landroid/widget/TextView;->setTextColor(I)V

    .line 478
    .line 479
    .line 480
    invoke-virtual {v4, v12}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 481
    .line 482
    .line 483
    const/4 v14, 0x4

    .line 484
    invoke-direct {v0, v14}, Lc2;->u(I)I

    .line 485
    .line 486
    .line 487
    move-result v10

    .line 488
    invoke-direct {v0, v14}, Lc2;->u(I)I

    .line 489
    .line 490
    .line 491
    move-result v11

    .line 492
    invoke-direct {v0, v3}, Lc2;->u(I)I

    .line 493
    .line 494
    .line 495
    move-result v12

    .line 496
    invoke-virtual {v4, v10, v7, v11, v12}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 497
    .line 498
    .line 499
    invoke-virtual {v4, v2}, Landroid/widget/TextView;->setTextIsSelectable(Z)V

    .line 500
    .line 501
    .line 502
    invoke-virtual {v1, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 503
    .line 504
    .line 505
    new-instance v4, Landroid/widget/EditText;

    .line 506
    .line 507
    invoke-virtual {v0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 508
    .line 509
    .line 510
    move-result-object v10

    .line 511
    invoke-direct {v4, v10}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 512
    .line 513
    .line 514
    invoke-direct {v0}, Lc2;->G()I

    .line 515
    .line 516
    .line 517
    move-result v10

    .line 518
    invoke-virtual {v4, v10}, Landroid/widget/TextView;->setTextColor(I)V

    .line 519
    .line 520
    .line 521
    invoke-direct {v0}, Lc2;->F()I

    .line 522
    .line 523
    .line 524
    move-result v10

    .line 525
    invoke-virtual {v4, v10}, Landroid/widget/TextView;->setHintTextColor(I)V

    .line 526
    .line 527
    .line 528
    const-string v10, "\u8bf7\u957f\u6309\u4e0a\u65b9\u6587\u672c\u590d\u5236\u5e76\u7c98\u8d34\u5230\u6b64\u5904"

    .line 529
    .line 530
    invoke-virtual {v4, v10}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 531
    .line 532
    .line 533
    invoke-virtual {v4, v8}, Landroid/widget/TextView;->setTextSize(F)V

    .line 534
    .line 535
    .line 536
    new-instance v8, Landroid/graphics/drawable/GradientDrawable;

    .line 537
    .line 538
    invoke-direct {v8}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 539
    .line 540
    .line 541
    invoke-virtual {v8, v7}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 542
    .line 543
    .line 544
    invoke-direct {v0, v9}, Lc2;->u(I)I

    .line 545
    .line 546
    .line 547
    move-result v10

    .line 548
    int-to-float v10, v10

    .line 549
    invoke-virtual {v8, v10}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 550
    .line 551
    .line 552
    invoke-direct {v0, v2}, Lc2;->u(I)I

    .line 553
    .line 554
    .line 555
    move-result v10

    .line 556
    invoke-direct {v0}, Lc2;->D()I

    .line 557
    .line 558
    .line 559
    move-result v11

    .line 560
    invoke-virtual {v8, v10, v11}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 561
    .line 562
    .line 563
    invoke-direct {v0}, Lc2;->C()I

    .line 564
    .line 565
    .line 566
    move-result v10

    .line 567
    invoke-virtual {v8, v10}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 568
    .line 569
    .line 570
    invoke-virtual {v4, v8}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 571
    .line 572
    .line 573
    invoke-direct {v0, v9}, Lc2;->u(I)I

    .line 574
    .line 575
    .line 576
    move-result v8

    .line 577
    invoke-direct {v0, v5}, Lc2;->u(I)I

    .line 578
    .line 579
    .line 580
    move-result v10

    .line 581
    invoke-direct {v0, v9}, Lc2;->u(I)I

    .line 582
    .line 583
    .line 584
    move-result v9

    .line 585
    invoke-direct {v0, v5}, Lc2;->u(I)I

    .line 586
    .line 587
    .line 588
    move-result v5

    .line 589
    invoke-virtual {v4, v8, v10, v9, v5}, Landroid/view/View;->setPadding(IIII)V

    .line 590
    .line 591
    .line 592
    invoke-virtual {v4, v13}, Landroid/widget/TextView;->setMinLines(I)V

    .line 593
    .line 594
    .line 595
    const/4 v14, 0x4

    .line 596
    invoke-virtual {v4, v14}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 597
    .line 598
    .line 599
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 600
    .line 601
    const/4 v8, -0x2

    .line 602
    invoke-direct {v5, v6, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 603
    .line 604
    .line 605
    invoke-virtual {v4, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 606
    .line 607
    .line 608
    invoke-virtual {v1, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 609
    .line 610
    .line 611
    new-instance v5, Landroid/widget/LinearLayout;

    .line 612
    .line 613
    invoke-virtual {v0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 614
    .line 615
    .line 616
    move-result-object v8

    .line 617
    invoke-direct {v5, v8}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 618
    .line 619
    .line 620
    invoke-virtual {v5, v7}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 621
    .line 622
    .line 623
    const/16 v8, 0xe

    .line 624
    .line 625
    invoke-direct {v0, v8}, Lc2;->u(I)I

    .line 626
    .line 627
    .line 628
    move-result v8

    .line 629
    const/16 v9, 0x14

    .line 630
    .line 631
    invoke-direct {v0, v9}, Lc2;->u(I)I

    .line 632
    .line 633
    .line 634
    move-result v9

    .line 635
    invoke-virtual {v5, v7, v8, v7, v9}, Landroid/view/View;->setPadding(IIII)V

    .line 636
    .line 637
    .line 638
    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    .line 639
    .line 640
    const/4 v9, -0x2

    .line 641
    invoke-direct {v8, v6, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 642
    .line 643
    .line 644
    invoke-virtual {v5, v8}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 645
    .line 646
    .line 647
    new-instance v8, Landroid/widget/Button;

    .line 648
    .line 649
    invoke-virtual {v0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 650
    .line 651
    .line 652
    move-result-object v9

    .line 653
    invoke-direct {v8, v9}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V

    .line 654
    .line 655
    .line 656
    const-string v9, "\u62d2\u7edd\u5e76\u9000\u51fa"

    .line 657
    .line 658
    invoke-virtual {v8, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 659
    .line 660
    .line 661
    const/high16 v9, 0x41600000    # 14.0f

    .line 662
    .line 663
    invoke-virtual {v8, v9}, Landroid/widget/TextView;->setTextSize(F)V

    .line 664
    .line 665
    .line 666
    invoke-direct {v0}, Lc2;->z()I

    .line 667
    .line 668
    .line 669
    move-result v10

    .line 670
    invoke-virtual {v8, v10}, Landroid/widget/TextView;->setTextColor(I)V

    .line 671
    .line 672
    .line 673
    new-instance v10, Landroid/graphics/drawable/GradientDrawable;

    .line 674
    .line 675
    invoke-direct {v10}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 676
    .line 677
    .line 678
    invoke-virtual {v10, v7}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 679
    .line 680
    .line 681
    const/16 v11, 0x1c

    .line 682
    .line 683
    invoke-direct {v0, v11}, Lc2;->u(I)I

    .line 684
    .line 685
    .line 686
    move-result v12

    .line 687
    int-to-float v11, v12

    .line 688
    invoke-virtual {v10, v11}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 689
    .line 690
    .line 691
    invoke-direct {v0}, Lc2;->y()I

    .line 692
    .line 693
    .line 694
    move-result v11

    .line 695
    invoke-virtual {v10, v11}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 696
    .line 697
    .line 698
    invoke-virtual {v8, v10}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 699
    .line 700
    .line 701
    new-instance v10, Landroid/widget/LinearLayout$LayoutParams;

    .line 702
    .line 703
    const/16 v11, 0x2e

    .line 704
    .line 705
    invoke-direct {v0, v11}, Lc2;->u(I)I

    .line 706
    .line 707
    .line 708
    move-result v12

    .line 709
    const/high16 v13, 0x3f800000    # 1.0f

    .line 710
    .line 711
    invoke-direct {v10, v7, v12, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 712
    .line 713
    .line 714
    invoke-direct {v0, v3}, Lc2;->u(I)I

    .line 715
    .line 716
    .line 717
    move-result v12

    .line 718
    invoke-virtual {v10, v7, v7, v12, v7}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 719
    .line 720
    .line 721
    invoke-virtual {v8, v10}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 722
    .line 723
    .line 724
    new-instance v10, Lz1;

    .line 725
    .line 726
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 727
    .line 728
    .line 729
    invoke-virtual {v8, v10}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 730
    .line 731
    .line 732
    invoke-virtual {v5, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 733
    .line 734
    .line 735
    new-instance v8, Landroid/widget/Button;

    .line 736
    .line 737
    invoke-virtual {v0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 738
    .line 739
    .line 740
    move-result-object v10

    .line 741
    invoke-direct {v8, v10}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V

    .line 742
    .line 743
    .line 744
    const-string v10, "\u540c\u610f\u5e76\u8fdb\u884c\u6d4b\u8bd5(30s)"

    .line 745
    .line 746
    invoke-virtual {v8, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 747
    .line 748
    .line 749
    invoke-virtual {v8, v9}, Landroid/widget/TextView;->setTextSize(F)V

    .line 750
    .line 751
    .line 752
    invoke-direct {v0}, Lc2;->A()I

    .line 753
    .line 754
    .line 755
    move-result v9

    .line 756
    invoke-virtual {v8, v9}, Landroid/widget/TextView;->setTextColor(I)V

    .line 757
    .line 758
    .line 759
    invoke-virtual {v8, v7}, Landroid/view/View;->setEnabled(Z)V

    .line 760
    .line 761
    .line 762
    new-instance v9, Landroid/graphics/drawable/GradientDrawable;

    .line 763
    .line 764
    invoke-direct {v9}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 765
    .line 766
    .line 767
    invoke-virtual {v9, v7}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 768
    .line 769
    .line 770
    const/16 v10, 0x1c

    .line 771
    .line 772
    invoke-direct {v0, v10}, Lc2;->u(I)I

    .line 773
    .line 774
    .line 775
    move-result v10

    .line 776
    int-to-float v10, v10

    .line 777
    invoke-virtual {v9, v10}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 778
    .line 779
    .line 780
    const/16 v10, 0x2c

    .line 781
    .line 782
    const/16 v12, 0x55

    .line 783
    .line 784
    const/16 v13, 0x64

    .line 785
    .line 786
    const/16 v14, 0xfe

    .line 787
    .line 788
    invoke-static {v13, v14, v10, v12}, Landroid/graphics/Color;->argb(IIII)I

    .line 789
    .line 790
    .line 791
    move-result v10

    .line 792
    invoke-virtual {v9, v10}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 793
    .line 794
    .line 795
    invoke-virtual {v8, v9}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 796
    .line 797
    .line 798
    new-instance v9, Landroid/widget/LinearLayout$LayoutParams;

    .line 799
    .line 800
    invoke-direct {v0, v11}, Lc2;->u(I)I

    .line 801
    .line 802
    .line 803
    move-result v10

    .line 804
    const/high16 v13, 0x3f800000    # 1.0f

    .line 805
    .line 806
    invoke-direct {v9, v7, v10, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 807
    .line 808
    .line 809
    invoke-direct {v0, v3}, Lc2;->u(I)I

    .line 810
    .line 811
    .line 812
    move-result v3

    .line 813
    invoke-virtual {v9, v3, v7, v7, v7}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 814
    .line 815
    .line 816
    invoke-virtual {v8, v9}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 817
    .line 818
    .line 819
    new-instance v3, Lqf0;

    .line 820
    .line 821
    invoke-direct {v3, v2, v8, v0}, Lqf0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 822
    .line 823
    .line 824
    invoke-virtual {v8, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 825
    .line 826
    .line 827
    iput-object v8, v0, Lc2;->e:Landroid/widget/Button;

    .line 828
    .line 829
    invoke-virtual {v5, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 830
    .line 831
    .line 832
    invoke-virtual {v1, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 833
    .line 834
    .line 835
    new-instance v2, Lc2$b;

    .line 836
    .line 837
    invoke-direct {v2, v0}, Lc2$b;-><init>(Lc2;)V

    .line 838
    .line 839
    .line 840
    invoke-virtual {v4, v2}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 841
    .line 842
    .line 843
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 844
    .line 845
    .line 846
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 847
    .line 848
    .line 849
    move-result-object v1

    .line 850
    if-eqz v1, :cond_0

    .line 851
    .line 852
    invoke-virtual {v1, v6, v6}, Landroid/view/Window;->setLayout(II)V

    .line 853
    .line 854
    .line 855
    :cond_0
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 856
    .line 857
    .line 858
    move-result-object v1

    .line 859
    if-eqz v1, :cond_1

    .line 860
    .line 861
    new-instance v2, Landroid/graphics/drawable/ColorDrawable;

    .line 862
    .line 863
    invoke-direct {v0}, Lc2;->x()I

    .line 864
    .line 865
    .line 866
    move-result v0

    .line 867
    invoke-direct {v2, v0}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 868
    .line 869
    .line 870
    invoke-virtual {v1, v2}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 871
    .line 872
    .line 873
    :cond_1
    return-void
.end method

.method private static final s(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-static {p0}, Landroid/os/Process;->killProcess(I)V

    .line 6
    .line 7
    .line 8
    const/4 p0, 0x0

    .line 9
    invoke-static {p0}, Ljava/lang/System;->exit(I)V

    .line 10
    .line 11
    .line 12
    new-instance p0, Ljava/lang/RuntimeException;

    .line 13
    .line 14
    const-string v0, "System.exit returned normally, while it was supposed to halt JVM."

    .line 15
    .line 16
    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p0
.end method

.method private static final t(Landroid/widget/Button;Lc2;Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object p2, Lc2;->j:Lc2$a;

    .line 6
    .line 7
    invoke-static {p2}, Lc2$a;->c(Lc2$a;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-static {p2}, Lc2$a;->b(Lc2$a;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    const/4 v0, 0x1

    .line 25
    invoke-interface {p0, p2, v0}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method private final u(I)I
    .locals 0

    .line 1
    int-to-float p1, p1

    .line 2
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    iget p0, p0, Landroid/util/DisplayMetrics;->density:F

    .line 15
    .line 16
    mul-float/2addr p1, p0

    .line 17
    float-to-int p0, p1

    .line 18
    return p0
.end method

.method private final v(Ljava/lang/String;)Landroid/text/Spanned;
    .locals 5

    .line 1
    const-string p0, "\n \n\u4e00\u3001"

    .line 2
    .line 3
    const-string v0, "##S##\u4e00\u3001"

    .line 4
    .line 5
    invoke-static {p1, p0, v0}, Lr41;->R(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const-string p1, "\n \n\u4e8c\u3001"

    .line 10
    .line 11
    const-string v1, "##S##\u4e8c\u3001"

    .line 12
    .line 13
    invoke-static {p0, p1, v1}, Lr41;->R(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    const-string p1, "\n \n\u4e09\u3001"

    .line 18
    .line 19
    const-string v2, "##S##\u4e09\u3001"

    .line 20
    .line 21
    invoke-static {p0, p1, v2}, Lr41;->R(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    const-string p1, "\n \n\u56db\u3001"

    .line 26
    .line 27
    const-string v3, "##S##\u56db\u3001"

    .line 28
    .line 29
    invoke-static {p0, p1, v3}, Lr41;->R(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    const-string p1, "\n \n"

    .line 34
    .line 35
    const-string v4, "\n"

    .line 36
    .line 37
    invoke-static {p0, p1, v4}, Lr41;->R(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    const-string p1, "<br/>"

    .line 42
    .line 43
    invoke-static {p0, v4, p1}, Lr41;->R(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    const-string p1, "<br/><br/><b><font color=\'#FE2C55\'>\u4e00\u3001"

    .line 48
    .line 49
    invoke-static {p0, v0, p1}, Lr41;->R(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    const-string p1, "</font></b><br/><br/><b><font color=\'#FE2C55\'>\u4e8c\u3001"

    .line 54
    .line 55
    invoke-static {p0, v1, p1}, Lr41;->R(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    const-string p1, "</font></b><br/><br/><b><font color=\'#FE2C55\'>\u4e09\u3001"

    .line 60
    .line 61
    invoke-static {p0, v2, p1}, Lr41;->R(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    const-string p1, "</font></b><br/><br/><b><font color=\'#FE2C55\'>\u56db\u3001"

    .line 66
    .line 67
    invoke-static {p0, v3, p1}, Lr41;->R(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    const-string p1, "</font></b>"

    .line 72
    .line 73
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    const/4 p1, 0x0

    .line 78
    invoke-static {p0, p1}, Landroid/text/Html;->fromHtml(Ljava/lang/String;I)Landroid/text/Spanned;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    return-object p0
.end method

.method private final w()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    iget p0, p0, Landroid/content/res/Configuration;->uiMode:I

    .line 14
    .line 15
    and-int/lit8 p0, p0, 0x30

    .line 16
    .line 17
    const/16 v0, 0x20

    .line 18
    .line 19
    if-ne p0, v0, :cond_0

    .line 20
    .line 21
    const/4 p0, 0x1

    .line 22
    return p0

    .line 23
    :cond_0
    const/4 p0, 0x0

    .line 24
    return p0
.end method

.method private final x()I
    .locals 2

    .line 1
    invoke-direct {p0}, Lc2;->w()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/16 v0, 0xff

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    const/16 p0, 0x19

    .line 10
    .line 11
    const/16 v1, 0x14

    .line 12
    .line 13
    :goto_0
    invoke-static {v0, v1, v1, p0}, Landroid/graphics/Color;->argb(IIII)I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0

    .line 18
    :cond_0
    const/16 p0, 0xfa

    .line 19
    .line 20
    const/16 v1, 0xf5

    .line 21
    .line 22
    goto :goto_0
.end method

.method private final y()I
    .locals 2

    .line 1
    invoke-direct {p0}, Lc2;->w()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/16 p0, 0xc8

    .line 8
    .line 9
    const/16 v0, 0x6e

    .line 10
    .line 11
    const/16 v1, 0x64

    .line 12
    .line 13
    invoke-static {p0, v1, v1, v0}, Landroid/graphics/Color;->argb(IIII)I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0

    .line 18
    :cond_0
    const/16 p0, 0x1e

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-static {p0, v0, v0, v0}, Landroid/graphics/Color;->argb(IIII)I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    return p0
.end method

.method private final z()I
    .locals 1

    .line 1
    invoke-direct {p0}, Lc2;->w()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/4 p0, -0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/16 p0, 0x96

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-static {p0, v0, v0, v0}, Landroid/graphics/Color;->argb(IIII)I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method


# virtual methods
.method public onBackPressed()V
    .locals 0

    .line 1
    return-void
.end method
