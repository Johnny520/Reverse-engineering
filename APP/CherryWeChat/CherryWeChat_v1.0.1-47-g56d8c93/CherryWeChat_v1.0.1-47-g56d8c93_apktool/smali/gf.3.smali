.class public Lgf;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LZb;
.implements Lbs;
.implements Lzw;
.implements Lkc;
.implements LCr;
.implements Lq0;
.implements LQn;
.implements LN5;
.implements Lg6;
.implements LPf;


# static fields
.field public static final synthetic b:Lgf;

.field public static final synthetic c:Lgf;

.field public static final d:Lgf;

.field public static final e:Lgf;

.field public static final synthetic f:Lgf;

.field public static final g:Lgf;

.field public static final h:Lgf;

.field public static final i:Lgf;

.field public static final j:Lgf;

.field public static final k:Lgf;

.field public static final l:Lgf;

.field public static final m:Lgf;

.field public static final n:Lgf;

.field public static o:I

.field public static p:Landroid/app/Application;

.field public static q:Ljava/lang/ref/WeakReference;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lgf;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lgf;-><init>(I)V

    sput-object v0, Lgf;->b:Lgf;

    new-instance v0, Lgf;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lgf;-><init>(I)V

    sput-object v0, Lgf;->c:Lgf;

    new-instance v0, Lgf;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Lgf;-><init>(I)V

    sput-object v0, Lgf;->d:Lgf;

    new-instance v0, Lgf;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Lgf;-><init>(I)V

    sput-object v0, Lgf;->e:Lgf;

    new-instance v0, Lgf;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Lgf;-><init>(I)V

    sput-object v0, Lgf;->f:Lgf;

    new-instance v0, Lgf;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Lgf;-><init>(I)V

    sput-object v0, Lgf;->g:Lgf;

    new-instance v0, Lgf;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Lgf;-><init>(I)V

    sput-object v0, Lgf;->h:Lgf;

    new-instance v0, Lgf;

    const/16 v1, 0xb

    invoke-direct {v0, v1}, Lgf;-><init>(I)V

    sput-object v0, Lgf;->i:Lgf;

    new-instance v0, Lgf;

    const/16 v1, 0xc

    invoke-direct {v0, v1}, Lgf;-><init>(I)V

    sput-object v0, Lgf;->j:Lgf;

    new-instance v0, Lgf;

    const/16 v1, 0xd

    invoke-direct {v0, v1}, Lgf;-><init>(I)V

    sput-object v0, Lgf;->k:Lgf;

    new-instance v0, Lgf;

    const/16 v1, 0xe

    invoke-direct {v0, v1}, Lgf;-><init>(I)V

    sput-object v0, Lgf;->l:Lgf;

    new-instance v0, Lgf;

    const/16 v1, 0xf

    invoke-direct {v0, v1}, Lgf;-><init>(I)V

    sput-object v0, Lgf;->m:Lgf;

    new-instance v0, Lgf;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Lgf;-><init>(I)V

    sput-object v0, Lgf;->n:Lgf;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lgf;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static A()Landroid/app/Application;
    .locals 3

    sget-object v0, Lio/github/cherrywechat/application/MainApplication;->a:Lio/github/cherrywechat/application/MainApplication;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    sget-object v0, Lgf;->p:Landroid/app/Application;

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    invoke-static {}, Landroid/app/AndroidAppHelper;->currentApplication()Landroid/app/Application;

    move-result-object v0

    const-wide v1, -0x2f91cfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    return-object v0
.end method

.method public static B(Landroid/content/Context;)Landroid/widget/LinearLayout;
    .locals 6

    const/16 v0, 0x18

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, Landroid/widget/EditText;

    invoke-direct {v1, p0}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    const v2, 0x550603f9

    invoke-virtual {p0, v2}, Landroid/content/Context;->getColor(I)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/view/View;->setFocusable(Z)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    invoke-virtual {v1}, Landroid/view/View;->requestFocus()Z

    invoke-virtual {v1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-eqz v2, :cond_0

    new-instance v3, Landroid/graphics/PorterDuffColorFilter;

    const v4, -0xbd7a0c

    sget-object v5, Landroid/graphics/PorterDuff$Mode;->SRC_ATOP:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v3, v4, v5}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v2, v3}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    :cond_0
    new-instance v2, Landroid/widget/LinearLayout;

    invoke-direct {v2, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    new-instance p0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v3, -0x1

    const/4 v4, -0x2

    invoke-direct {p0, v3, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v0}, LGu;->i(Ljava/lang/Number;)I

    move-result v3

    const/16 v4, 0x14

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v4}, LGu;->i(Ljava/lang/Number;)I

    move-result v4

    invoke-static {v0}, LGu;->i(Ljava/lang/Number;)I

    move-result v0

    const/4 v5, 0x0

    invoke-virtual {p0, v3, v4, v0, v5}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    invoke-virtual {v1, p0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-object v2
.end method

.method public static C(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
    .locals 4

    const-wide v0, -0x2f8ecfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, LcG;->a:Ljava/util/LinkedHashMap;

    const-wide v1, -0x215a4fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LbG;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, v0, LbG;->a:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    instance-of v2, v0, Ljava/lang/Class;

    if-eqz v2, :cond_1

    check-cast v0, Ljava/lang/Class;

    goto :goto_1

    :cond_1
    move-object v0, v1

    :goto_1
    const-class v2, Ljava/lang/String;

    sget-object v3, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    filled-new-array {v2, v3}, [Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    const/high16 v2, 0x3f000000    # 0.5f

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    filled-new-array {p0, v2}, [Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    instance-of v0, p0, Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_2

    check-cast p0, Landroid/graphics/drawable/Drawable;

    return-object p0

    :cond_2
    return-object v1
.end method

.method public static D()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v1, -0x1647dfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide v1, -0x1640afffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lgf;->J()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide v1, -0x16413fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lgf;->G()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static E()Ljava/util/HashMap;
    .locals 3

    sget-object v0, LcG;->a:Ljava/util/LinkedHashMap;

    const-wide v1, -0x21610fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LbG;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, v0, LbG;->a:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    instance-of v2, v0, Ljava/lang/reflect/Method;

    if-eqz v2, :cond_1

    check-cast v0, Ljava/lang/reflect/Method;

    goto :goto_1

    :cond_1
    move-object v0, v1

    :goto_1
    invoke-virtual {v0, v1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-wide v1, -0x2f9e3fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    check-cast v0, Ljava/util/HashMap;

    return-object v0
.end method

.method public static varargs F(Landroid/view/ViewGroup;[I)Landroid/view/View;
    .locals 4

    const-wide v0, -0x2fa88fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    if-eqz p0, :cond_2

    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    aget v2, p1, v1

    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p0

    array-length v2, p1

    add-int/lit8 v2, v2, -0x1

    if-eq v1, v2, :cond_1

    instance-of v2, p0, Landroid/view/ViewGroup;

    if-eqz v2, :cond_0

    check-cast p0, Landroid/view/ViewGroup;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v2, -0x2fa90fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-wide v0, -0x2fa9ffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    return-object p0

    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method

.method public static G()Ljava/lang/String;
    .locals 4

    invoke-static {}, Lgf;->E()Ljava/util/HashMap;

    move-result-object v0

    const-wide v1, -0x2f876fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    const-wide v0, -0x2f809fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_2

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    :cond_2
    return-object v0
.end method

.method public static H()Landroid/graphics/drawable/Drawable;
    .locals 5

    invoke-static {}, Lgf;->A()Landroid/app/Application;

    move-result-object v0

    invoke-static {}, Lgf;->A()Landroid/app/Application;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v1

    iget-object v1, v1, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    const-wide v2, -0x2f9d7fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    const-wide v2, -0x2f80afffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    const-wide v3, -0x2f817fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    const-wide v3, -0x2f828fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-wide v3, -0x2f829fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_0

    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v0, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    return-object v0

    :cond_0
    invoke-static {v0}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    const-wide v1, -0x2f8dcfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    invoke-static {}, Lgf;->A()Landroid/app/Application;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const-wide v2, -0x2f934fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    new-instance v2, Landroid/graphics/drawable/BitmapDrawable;

    invoke-direct {v2, v1, v0}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    return-object v2
.end method

.method public static I()Ljava/lang/String;
    .locals 3

    invoke-static {}, Lgf;->E()Ljava/util/HashMap;

    move-result-object v0

    const-wide v1, -0x2f9a0fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    const-wide v0, -0x2f9b6fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public static J()Ljava/lang/String;
    .locals 3

    invoke-static {}, Lgf;->E()Ljava/util/HashMap;

    move-result-object v0

    const-wide v1, -0x2f85efffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    const-wide v0, -0x2f875fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public static K()Ljava/lang/String;
    .locals 3

    invoke-static {}, Lgf;->E()Ljava/util/HashMap;

    move-result-object v0

    const-wide v1, -0x2f848fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    const-wide v0, -0x2f85dfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public static L()Ljava/lang/String;
    .locals 3

    invoke-static {}, Lgf;->E()Ljava/util/HashMap;

    move-result-object v0

    const-wide v1, -0x2f9b7fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    invoke-static {}, Lgf;->I()Ljava/lang/String;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public static M(Landroid/view/ViewGroup;IIZ)V
    .locals 7

    if-nez p0, :cond_0

    goto :goto_2

    :cond_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_5

    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    instance-of v4, v3, Landroid/widget/TextView;

    if-eqz v4, :cond_3

    if-eqz p3, :cond_1

    if-eqz p2, :cond_3

    move-object v4, v3

    check-cast v4, Landroid/widget/TextView;

    invoke-static {v4, p2}, Lgf;->O(Landroid/widget/TextView;I)V

    goto :goto_1

    :cond_1
    move-object v4, v3

    check-cast v4, Landroid/widget/TextView;

    invoke-virtual {v4}, Landroid/widget/TextView;->getTextSize()F

    move-result v5

    const/16 v6, 0xd

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v6}, LGu;->i(Ljava/lang/Number;)I

    move-result v6

    int-to-float v6, v6

    cmpg-float v5, v5, v6

    if-gez v5, :cond_2

    if-eqz p2, :cond_2

    invoke-virtual {v4, p2}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_1

    :cond_2
    if-eqz p1, :cond_3

    invoke-virtual {v4, p1}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_3
    :goto_1
    instance-of v4, v3, Landroid/view/ViewGroup;

    if-eqz v4, :cond_4

    check-cast v3, Landroid/view/ViewGroup;

    invoke-static {v3, p1, p2, v1}, Lgf;->M(Landroid/view/ViewGroup;IIZ)V

    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_5
    :goto_2
    return-void
.end method

.method public static N(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V
    .locals 2

    if-eqz p0, :cond_0

    const/4 v0, 0x0

    const v1, 0x550a022b

    invoke-virtual {p0, v1, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    invoke-virtual {p0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const-class p1, Ljava/lang/Object;

    invoke-virtual {p0, v1, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public static O(Landroid/widget/TextView;I)V
    .locals 2

    if-eqz p0, :cond_0

    const/4 v0, 0x0

    const v1, 0x550a0227

    invoke-virtual {p0, v1, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    const-class p1, Landroid/widget/TextView;

    invoke-virtual {p0, v1, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public static P(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LNd;)V
    .locals 8

    const-wide v0, -0x2f0f9fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x2f081fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x2f08afffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v6, p3

    move-object v7, p4

    invoke-static/range {v2 .. v7}, Lgf;->Q(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LNd;)V

    return-void
.end method

.method public static Q(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LNd;)V
    .locals 5

    const-wide v0, -0x2f098fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x2f0a0fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x2f0a4fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-static {p0}, Lgf;->B(Landroid/content/Context;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    const-wide v3, -0x2f0adfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    check-cast v2, Landroid/widget/EditText;

    invoke-static {p3, p4}, LNx;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v2, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result p3

    invoke-virtual {v2, p3}, Landroid/widget/EditText;->setSelection(I)V

    new-instance p3, Landroid/app/AlertDialog$Builder;

    const p4, 0x103023a

    invoke-direct {p3, p0, p4}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;I)V

    invoke-virtual {p3, p1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    new-instance p2, LOd;

    invoke-direct {p2, p5, v2}, LOd;-><init>(LNd;Landroid/widget/EditText;)V

    const p3, 0x104000a

    invoke-virtual {p1, p3, p2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    new-instance p2, LPd;

    invoke-direct {p2, p0, v2}, LPd;-><init>(Landroid/content/Context;Landroid/widget/EditText;)V

    invoke-virtual {p1, p2}, Landroid/app/AlertDialog$Builder;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)Landroid/app/AlertDialog$Builder;

    move-result-object p0

    const/high16 p1, 0x1040000

    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object p0

    invoke-virtual {p0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p0

    invoke-virtual {p0}, Landroid/app/Dialog;->show()V

    invoke-static {p0, v1}, Lgf;->T(Landroid/app/AlertDialog;Z)V

    return-void
.end method

.method public static R(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;LNd;)V
    .locals 18

    move-object/from16 v3, p0

    const/16 v0, 0xa

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const/16 v0, 0x8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const/16 v1, 0x18

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    const-wide v1, -0x2ff6afffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x2ff72fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x2ff76fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x2ff7ffffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v3}, Lgf;->B(Landroid/content/Context;)Landroid/widget/LinearLayout;

    move-result-object v9

    const/4 v10, 0x1

    invoke-virtual {v9, v10}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/4 v11, 0x0

    invoke-virtual {v9, v11}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    const-wide v4, -0x2ff07fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    check-cast v1, Landroid/widget/EditText;

    invoke-static/range {p3 .. p4}, LNx;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/EditText;->setSelection(I)V

    invoke-interface/range {p5 .. p5}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    new-instance v12, Landroid/widget/TextView;

    invoke-direct {v12, v3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-wide v4, -0x2ffc4fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v12, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v2, 0x41600000    # 14.0f

    invoke-virtual {v12, v2}, Landroid/widget/TextView;->setTextSize(F)V

    const v2, -0xff8501

    invoke-virtual {v12, v2}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-static {v8}, LGu;->i(Ljava/lang/Number;)I

    move-result v2

    const/16 v4, 0x10

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v4}, LGu;->i(Ljava/lang/Number;)I

    move-result v4

    invoke-static {v8}, LGu;->i(Ljava/lang/Number;)I

    move-result v5

    invoke-static {v7}, LGu;->i(Ljava/lang/Number;)I

    move-result v13

    invoke-virtual {v12, v2, v4, v5, v13}, Landroid/widget/TextView;->setPadding(IIII)V

    invoke-virtual {v12, v10}, Landroid/view/View;->setClickable(Z)V

    new-instance v13, Landroid/widget/LinearLayout;

    invoke-direct {v13, v3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v13, v10}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v14, Landroid/widget/ScrollView;

    invoke-direct {v14, v3}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    invoke-virtual {v14, v0}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {v14, v13}, Landroid/widget/ScrollView;->addView(Landroid/view/View;)V

    new-instance v0, Ll5;

    const/4 v2, 0x6

    invoke-direct {v0, v2, v14, v12}, Ll5;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v12, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-interface/range {p5 .. p5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :goto_0
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LEt;

    iget-object v5, v0, LEt;->a:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v0, v0, LEt;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    new-instance v11, Landroid/widget/LinearLayout;

    invoke-direct {v11, v3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v11, v10}, Landroid/widget/LinearLayout;->setOrientation(I)V

    invoke-static {v8}, LGu;->i(Ljava/lang/Number;)I

    move-result v2

    invoke-static {v6}, LGu;->i(Ljava/lang/Number;)I

    move-result v4

    invoke-static {v8}, LGu;->i(Ljava/lang/Number;)I

    move-result v10

    move-object/from16 v17, v1

    invoke-static {v6}, LGu;->i(Ljava/lang/Number;)I

    move-result v1

    invoke-virtual {v11, v2, v4, v10, v1}, Landroid/view/View;->setPadding(IIII)V

    const/4 v1, 0x1

    invoke-virtual {v11, v1}, Landroid/view/View;->setClickable(Z)V

    new-instance v1, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v1}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const/high16 v2, 0x11000000

    invoke-virtual {v1, v2}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    invoke-static {v7}, LGu;->i(Ljava/lang/Number;)I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v1, v2}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {v11, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    new-instance v1, Landroid/widget/TextView;

    invoke-direct {v1, v3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v2, 0x41700000    # 15.0f

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextSize(F)V

    const v2, 0x550603f9

    invoke-virtual {v3, v2}, Landroid/content/Context;->getColor(I)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    sget-object v2, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    invoke-virtual {v11, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v1, Landroid/widget/TextView;

    invoke-direct {v1, v3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v2, 0x41400000    # 12.0f

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextSize(F)V

    const v2, -0x71716d

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-virtual {v11, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    move-object v2, v0

    new-instance v0, Lg;

    move-object v4, v5

    const/4 v5, 0x1

    move-object/from16 v1, v17

    const/4 v10, -0x2

    move-object/from16 v17, v6

    const/4 v6, -0x1

    invoke-direct/range {v0 .. v5}, Lg;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v11, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v0, v6, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v8}, LGu;->i(Ljava/lang/Number;)I

    move-result v2

    invoke-static {v7}, LGu;->i(Ljava/lang/Number;)I

    move-result v4

    invoke-static {v8}, LGu;->i(Ljava/lang/Number;)I

    move-result v5

    const/4 v6, 0x0

    invoke-virtual {v0, v2, v4, v5, v6}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    invoke-virtual {v13, v11, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    move v11, v6

    move-object/from16 v6, v17

    const/4 v10, 0x1

    goto/16 :goto_0

    :cond_0
    const/4 v6, -0x1

    const/4 v10, -0x2

    invoke-virtual {v9, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v0, v6, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v9, v14, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :cond_1
    new-instance v0, Landroid/app/AlertDialog$Builder;

    const v2, 0x103023a

    invoke-direct {v0, v3, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;I)V

    move-object/from16 v2, p1

    invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    move-object/from16 v2, p2

    invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0, v9}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v2, LKb;

    const/4 v4, 0x1

    move-object/from16 v5, p6

    invoke-direct {v2, v4, v5, v1}, LKb;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v4, 0x104000a

    invoke-virtual {v0, v4, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v2, LLd;

    invoke-direct {v2, v3, v1}, LLd;-><init>(Landroid/content/Context;Landroid/widget/EditText;)V

    invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const/high16 v1, 0x1040000

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lgf;->T(Landroid/app/AlertDialog;Z)V

    return-void
.end method

.method public static S(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;Z)V
    .locals 2

    const-wide v0, -0x2f0f1fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    new-instance v0, Landroid/app/AlertDialog$Builder;

    const v1, 0x103023a

    invoke-direct {v0, p0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object p0

    invoke-virtual {p0, p2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object p0

    const p1, 0x104000a

    invoke-virtual {p0, p1, p3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object p0

    const/high16 p1, 0x1040000

    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object p0

    invoke-virtual {p0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p0

    invoke-virtual {p0}, Landroid/app/Dialog;->show()V

    invoke-static {p0, p4}, Lgf;->T(Landroid/app/AlertDialog;Z)V

    return-void
.end method

.method public static T(Landroid/app/AlertDialog;Z)V
    .locals 7

    const/16 v0, 0x10

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/16 v1, 0x18

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-wide v2, -0x2ffeafffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    const v2, 0x1020016

    invoke-virtual {p0, v2}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    const v3, 0x550603f9

    const/4 v4, 0x0

    if-eqz v2, :cond_0

    const/high16 v5, 0x41900000    # 18.0f

    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setTextSize(F)V

    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5, v3}, Landroid/content/Context;->getColor(I)I

    move-result v5

    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setTextColor(I)V

    sget-object v5, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    invoke-static {v1}, LGu;->i(Ljava/lang/Number;)I

    move-result v5

    invoke-static {v0}, LGu;->i(Ljava/lang/Number;)I

    move-result v6

    invoke-virtual {v2, v4, v5, v4, v6}, Landroid/widget/TextView;->setPadding(IIII)V

    :cond_0
    const v2, 0x102000b

    invoke-virtual {p0, v2}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    if-eqz v2, :cond_1

    const/high16 v5, 0x41700000    # 15.0f

    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setTextSize(F)V

    const v5, -0xc3c3bd

    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setTextColor(I)V

    const/high16 v5, 0x41000000    # 8.0f

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-virtual {v2, v5, v6}, Landroid/widget/TextView;->setLineSpacing(FF)V

    invoke-static {v1}, LGu;->i(Ljava/lang/Number;)I

    move-result v5

    const/16 v6, 0x8

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v6}, LGu;->i(Ljava/lang/Number;)I

    move-result v6

    invoke-static {v1}, LGu;->i(Ljava/lang/Number;)I

    move-result v1

    invoke-virtual {v2, v5, v6, v1, v4}, Landroid/widget/TextView;->setPadding(IIII)V

    const/4 v1, 0x1

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setTextIsSelectable(Z)V

    :cond_1
    const/4 v1, -0x1

    invoke-virtual {p0, v1}, Landroid/app/AlertDialog;->getButton(I)Landroid/widget/Button;

    move-result-object v1

    const/high16 v2, 0x41800000    # 16.0f

    if-eqz v1, :cond_2

    const v5, -0xff8501

    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextSize(F)V

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setAllCaps(Z)V

    :cond_2
    const/4 v1, -0x2

    invoke-virtual {p0, v1}, Landroid/app/AlertDialog;->getButton(I)Landroid/widget/Button;

    move-result-object v5

    if-eqz v5, :cond_3

    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-virtual {v6, v3}, Landroid/content/Context;->getColor(I)I

    move-result v3

    invoke-virtual {v5, v3}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-virtual {v5, v2}, Landroid/widget/TextView;->setTextSize(F)V

    invoke-virtual {v5, v4}, Landroid/widget/TextView;->setAllCaps(Z)V

    :cond_3
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p0

    if-eqz p0, :cond_4

    new-instance v2, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v2}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    invoke-virtual {p0}, Landroid/view/Window;->getContext()Landroid/content/Context;

    move-result-object v3

    const v4, 0x55060040

    invoke-virtual {v3, v4}, Landroid/content/Context;->getColor(I)I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    invoke-static {v0}, LGu;->i(Ljava/lang/Number;)I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {v2, v0}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {p0, v2}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    if-eqz p1, :cond_4

    invoke-virtual {p0}, Landroid/view/Window;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget p1, p1, Landroid/util/DisplayMetrics;->widthPixels:I

    int-to-double v2, p1

    const-wide v4, 0x3feb333333333333L    # 0.85

    mul-double/2addr v2, v4

    double-to-int p1, v2

    invoke-virtual {p0, p1, v1}, Landroid/view/Window;->setLayout(II)V

    :cond_4
    return-void
.end method

.method public static U(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    const-wide v0, -0x2f882fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x2f88afffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-wide v1, -0x2e746fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const-wide v1, -0x2e761fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    const/high16 p1, 0x10000000

    invoke-virtual {v0, p1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public static final n(Lgf;Ljava/util/Map;JLjava/lang/String;)Ljava/lang/String;
    .locals 5

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p0, Ljava/util/TreeMap;

    invoke-direct {p0, p1}, Ljava/util/TreeMap;-><init>(Ljava/util/Map;)V

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-wide v2, -0x16418fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    const-wide v3, -0x1641dfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    const-wide v3, -0x1641ffffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-wide p1, -0x16421fffff835L

    invoke-static {p1, p2}, LGu;->r(J)Ljava/lang/String;

    const-wide p1, -0x1646afffff835L

    invoke-static {p1, p2}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object p1

    sget-object p2, Lw7;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p0, p2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    const-wide p2, -0x1646efffff835L

    invoke-static {p2, p3}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {p1, p0}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object p0

    const-wide p1, -0x1647cfffff835L

    invoke-static {p1, p2}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Lb;

    const/16 p3, 0xc

    invoke-direct {p2, p3}, Lb;-><init>(I)V

    invoke-static {p0, p1, p2}, LP4;->H([BLjava/lang/String;Lfj;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static o(Landroid/view/ViewGroup;)V
    .locals 4

    const-wide v0, -0x2fbbbfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-static {p0}, Lgf;->r(Landroid/view/View;)V

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    instance-of v3, v2, Landroid/view/ViewGroup;

    if-eqz v3, :cond_0

    check-cast v2, Landroid/view/ViewGroup;

    invoke-static {v2}, Lgf;->o(Landroid/view/ViewGroup;)V

    goto :goto_1

    :cond_0
    invoke-static {v2}, Lgf;->r(Landroid/view/View;)V

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static q(Landroid/view/ViewGroup;)V
    .locals 4

    const-wide v0, -0x2fa45fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-static {p0}, Lgf;->r(Landroid/view/View;)V

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    instance-of v3, v2, Landroid/view/ViewGroup;

    if-eqz v3, :cond_0

    check-cast v2, Landroid/view/ViewGroup;

    invoke-static {v2}, Lgf;->q(Landroid/view/ViewGroup;)V

    goto :goto_1

    :cond_0
    instance-of v3, v2, Landroid/widget/TextView;

    if-nez v3, :cond_1

    invoke-static {v2}, Lgf;->r(Landroid/view/View;)V

    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public static r(Landroid/view/View;)V
    .locals 2

    if-eqz p0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const v0, 0x550a022b

    const-class v1, Ljava/lang/Object;

    invoke-virtual {p0, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public static t(Landroid/content/Context;Landroid/graphics/drawable/Drawable;)Landroid/widget/ImageView;
    .locals 3

    sget-object v0, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    const-wide v1, -0x2fabbfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x2f943fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    new-instance v1, Landroid/widget/ImageView;

    invoke-direct {v1, p0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    invoke-virtual {v1, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-object v1
.end method

.method public static u(Landroid/view/ViewGroup;)V
    .locals 12

    const/high16 v0, 0x40c00000    # 6.0f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    const/high16 v1, 0x42000000    # 32.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const-wide v2, -0x1dd91fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    sget v2, LTB;->i:I

    invoke-virtual {p0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    const/16 v3, 0xf

    const/4 v4, 0x0

    const/4 v5, 0x0

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v6

    const-wide v7, -0x1dd9bfffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    check-cast v6, Landroid/widget/RelativeLayout;

    sget-object v7, LXA;->a:Ljava/util/HashMap;

    const-wide v7, -0x1dc5efffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v7

    if-eqz v7, :cond_1

    invoke-virtual {v2, v4}, Landroid/view/View;->setAlpha(F)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const-wide v8, -0x1dc05fffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v2, v7}, Lgf;->t(Landroid/content/Context;Landroid/graphics/drawable/Drawable;)Landroid/widget/ImageView;

    move-result-object v2

    new-instance v7, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-static {v1}, LGu;->i(Ljava/lang/Number;)I

    move-result v8

    invoke-static {v1}, LGu;->i(Ljava/lang/Number;)I

    move-result v9

    invoke-direct {v7, v8, v9}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v7, v3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    invoke-static {v0}, LGu;->i(Ljava/lang/Number;)I

    move-result v8

    iput v8, v7, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I

    invoke-virtual {v6, v2, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0

    :cond_0
    move-object v6, v5

    :cond_1
    :goto_0
    const-wide v7, -0x1dc15fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {p0, v2}, Lgf;->y(Landroid/view/ViewGroup;Ljava/lang/String;)Landroid/widget/ImageView;

    move-result-object v2

    const/4 v7, 0x1

    const/16 v8, 0xb

    if-eqz v2, :cond_2

    sget-object v9, LXA;->a:Ljava/util/HashMap;

    const-wide v9, -0x1dc29fffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v9

    if-eqz v9, :cond_2

    invoke-virtual {v2, v4}, Landroid/view/View;->setAlpha(F)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const-wide v9, -0x1dcd0fffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    const-wide v9, -0x1dce0fffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v9

    invoke-static {v2, v9}, Lgf;->t(Landroid/content/Context;Landroid/graphics/drawable/Drawable;)Landroid/widget/ImageView;

    move-result-object v2

    new-instance v9, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-static {v1}, LGu;->i(Ljava/lang/Number;)I

    move-result v10

    invoke-static {v1}, LGu;->i(Ljava/lang/Number;)I

    move-result v11

    invoke-direct {v9, v10, v11}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v9, v3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    invoke-virtual {v9, v8, v7}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    invoke-static {v0}, LGu;->i(Ljava/lang/Number;)I

    move-result v10

    iput v10, v9, Landroid/widget/RelativeLayout$LayoutParams;->rightMargin:I

    if-eqz v6, :cond_2

    invoke-virtual {v6, v2, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :cond_2
    const-wide v9, -0x1dc87fffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {p0, v2}, Lgf;->y(Landroid/view/ViewGroup;Ljava/lang/String;)Landroid/widget/ImageView;

    move-result-object v2

    if-eqz v2, :cond_3

    sget-object v9, LXA;->a:Ljava/util/HashMap;

    const-wide v9, -0x1dca2fffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v9

    if-eqz v9, :cond_3

    invoke-virtual {v2, v4}, Landroid/view/View;->setAlpha(F)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    const-wide v10, -0x1db4bfffff835L

    invoke-static {v10, v11}, LGu;->r(J)Ljava/lang/String;

    invoke-static {p0, v9}, Lgf;->t(Landroid/content/Context;Landroid/graphics/drawable/Drawable;)Landroid/widget/ImageView;

    move-result-object p0

    new-instance v2, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-static {v1}, LGu;->i(Ljava/lang/Number;)I

    move-result v4

    invoke-static {v1}, LGu;->i(Ljava/lang/Number;)I

    move-result v1

    invoke-direct {v2, v4, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    invoke-virtual {v2, v8, v7}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    invoke-static {v0}, LGu;->i(Ljava/lang/Number;)I

    move-result v0

    iput v0, v2, Landroid/widget/RelativeLayout$LayoutParams;->rightMargin:I

    if-eqz v6, :cond_3

    invoke-virtual {v6, p0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :cond_3
    if-eqz v6, :cond_4

    const p0, 0x1020014

    invoke-virtual {v6, p0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    move-object v5, p0

    check-cast v5, Landroid/widget/TextView;

    :cond_4
    sget-object p0, LXA;->a:Ljava/util/HashMap;

    const-wide v0, -0x1db5bfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object p0

    const/high16 v0, -0x1000000

    invoke-static {v0, p0}, Lhw;->a(ILjava/lang/String;)I

    move-result p0

    invoke-static {v5, p0}, Lgf;->O(Landroid/widget/TextView;I)V

    return-void
.end method

.method public static v(Landroid/view/ViewGroup;Ljava/lang/String;)Landroid/view/View;
    .locals 4

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    return-object v2

    :cond_0
    instance-of v3, v2, Landroid/view/ViewGroup;

    if-eqz v3, :cond_1

    check-cast v2, Landroid/view/ViewGroup;

    invoke-static {v2, p1}, Lgf;->v(Landroid/view/ViewGroup;Ljava/lang/String;)Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_1

    return-object v2

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method

.method public static w(Landroid/view/ViewGroup;Ljava/lang/String;)Landroid/widget/TextView;
    .locals 5

    const-wide v0, -0x2fa4ffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x2fa59fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    instance-of v3, v2, Landroid/widget/TextView;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Landroid/widget/TextView;

    invoke-virtual {v3}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, p1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    return-object v3

    :cond_0
    instance-of v3, v2, Landroid/view/ViewGroup;

    if-eqz v3, :cond_1

    check-cast v2, Landroid/view/ViewGroup;

    invoke-static {v2, p1}, Lgf;->w(Landroid/view/ViewGroup;Ljava/lang/String;)Landroid/widget/TextView;

    move-result-object v2

    if-eqz v2, :cond_1

    return-object v2

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method

.method public static x(Landroid/view/ViewGroup;Ljava/util/ArrayList;)V
    .locals 5

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    move-result v3

    const/4 v4, 0x1

    if-ne v3, v4, :cond_0

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    instance-of v3, v2, Landroid/view/ViewGroup;

    if-eqz v3, :cond_1

    check-cast v2, Landroid/view/ViewGroup;

    invoke-static {v2, p1}, Lgf;->x(Landroid/view/ViewGroup;Ljava/util/ArrayList;)V

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public static y(Landroid/view/ViewGroup;Ljava/lang/String;)Landroid/widget/ImageView;
    .locals 5

    const-wide v0, -0x2fa5efffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x2fa68fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    instance-of v3, v2, Landroid/widget/ImageView;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Landroid/widget/ImageView;

    const v4, 0x550a022c

    invoke-virtual {v3, v4}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {p1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    return-object v3

    :cond_0
    instance-of v3, v2, Landroid/view/ViewGroup;

    if-eqz v3, :cond_1

    check-cast v2, Landroid/view/ViewGroup;

    invoke-static {v2, p1}, Lgf;->y(Landroid/view/ViewGroup;Ljava/lang/String;)Landroid/widget/ImageView;

    move-result-object v2

    if-eqz v2, :cond_1

    return-object v2

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method

.method public static z(Landroid/app/Activity;)I
    .locals 1

    sget v0, Lgf;->o:I

    if-nez v0, :cond_0

    if-eqz p0, :cond_0

    new-instance v0, Ln5;

    invoke-direct {v0, p0}, Ln5;-><init>(Landroid/app/Activity;)V

    iget p0, v0, Ln5;->b:I

    return p0

    :cond_0
    return v0
.end method


# virtual methods
.method public a()Ljava/lang/Class;
    .locals 1

    iget v0, p0, Lgf;->a:I

    packed-switch v0, :pswitch_data_0

    const-class v0, Ljava/io/InputStream;

    return-object v0

    :pswitch_0
    const-class v0, Ljava/nio/ByteBuffer;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x19
        :pswitch_0
    .end packed-switch
.end method

.method public b(Llr;Z)V
    .locals 0

    return-void
.end method

.method public c(Ljava/lang/Object;Ljava/io/File;Lvt;)Z
    .locals 0

    check-cast p1, Ljava/nio/ByteBuffer;

    :try_start_0
    invoke-static {p1, p2}, Lt6;->d(Ljava/nio/ByteBuffer;Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x1

    return p1

    :catch_0
    const/4 p1, 0x0

    return p1
.end method

.method public d(LWn;)V
    .locals 0

    return-void
.end method

.method public e(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    .locals 0

    invoke-static {p1, p2, p3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1
.end method

.method public g(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    .locals 0

    invoke-static {p1, p2, p3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1
.end method

.method public h(Landroid/graphics/Bitmap;)V
    .locals 0

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V

    return-void
.end method

.method public i(Lpw;Lvt;)Lpw;
    .locals 0

    return-object p1
.end method

.method public j([B)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lgf;->a:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/io/ByteArrayInputStream;

    invoke-direct {v0, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    return-object v0

    :pswitch_0
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x19
        :pswitch_0
    .end packed-switch
.end method

.method public k(I)V
    .locals 0

    return-void
.end method

.method public l(LWn;)V
    .locals 0

    invoke-interface {p1}, LWn;->k()V

    return-void
.end method

.method public m()V
    .locals 0

    return-void
.end method

.method public p(Lqs;)Las;
    .locals 2

    iget p1, p0, Lgf;->a:I

    sparse-switch p1, :sswitch_data_0

    new-instance p1, Lh6;

    new-instance v0, Lgf;

    const/16 v1, 0x1b

    invoke-direct {v0, v1}, Lgf;-><init>(I)V

    const/4 v1, 0x0

    invoke-direct {p1, v1, v0}, Lh6;-><init>(ILjava/lang/Object;)V

    return-object p1

    :sswitch_0
    new-instance p1, Lh6;

    new-instance v0, Lgf;

    const/16 v1, 0x19

    invoke-direct {v0, v1}, Lgf;-><init>(I)V

    const/4 v1, 0x0

    invoke-direct {p1, v1, v0}, Lh6;-><init>(ILjava/lang/Object;)V

    return-object p1

    :sswitch_1
    sget-object p1, LUC;->b:LUC;

    return-object p1

    :sswitch_data_0
    .sparse-switch
        0xd -> :sswitch_1
        0x1a -> :sswitch_0
    .end sparse-switch
.end method

.method public s(Llr;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
