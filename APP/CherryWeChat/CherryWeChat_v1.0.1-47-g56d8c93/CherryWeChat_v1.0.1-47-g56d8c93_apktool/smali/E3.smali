.class public final LE3;
.super Lq3;
.source ""

# interfaces
.implements Ljr;
.implements Landroid/view/LayoutInflater$Factory2;


# static fields
.field public static final h0:Lsy;

.field public static final i0:[I

.field public static final j0:Z


# instance fields
.field public A:Landroid/view/ViewGroup;

.field public B:Landroid/widget/TextView;

.field public C:Landroid/view/View;

.field public D:Z

.field public E:Z

.field public F:Z

.field public G:Z

.field public H:Z

.field public I:Z

.field public J:Z

.field public K:Z

.field public L:[LD3;

.field public M:LD3;

.field public N:Z

.field public O:Z

.field public P:Z

.field public Q:Z

.field public R:Landroid/content/res/Configuration;

.field public final S:I

.field public T:I

.field public U:I

.field public V:Z

.field public W:Lz3;

.field public X:Lz3;

.field public Y:Z

.field public Z:I

.field public final a0:Lr3;

.field public b0:Z

.field public c0:Landroid/graphics/Rect;

.field public d0:Landroid/graphics/Rect;

.field public e0:Lv4;

.field public f0:Landroid/window/OnBackInvokedDispatcher;

.field public g0:Landroid/window/OnBackInvokedCallback;

.field public final j:Ljava/lang/Object;

.field public final k:Landroid/content/Context;

.field public l:Landroid/view/Window;

.field public m:Ly3;

.field public final n:Ljava/lang/Object;

.field public o:Ln0;

.field public p:LLz;

.field public q:Ljava/lang/CharSequence;

.field public r:LKc;

.field public s:Ls3;

.field public t:Ls3;

.field public u:LI0;

.field public v:Landroidx/appcompat/widget/ActionBarContextView;

.field public w:Landroid/widget/PopupWindow;

.field public x:Lr3;

.field public y:LGE;

.field public z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lsy;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lsy;-><init>(I)V

    sput-object v0, LE3;->h0:Lsy;

    const v0, 0x1010054

    filled-new-array {v0}, [I

    move-result-object v0

    sput-object v0, LE3;->i0:[I

    const-string v0, "robolectric"

    sget-object v1, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    sput-boolean v0, LE3;->j0:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/view/Window;Lg3;Ljava/lang/Object;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, LE3;->y:LGE;

    const/16 v1, -0x64

    iput v1, p0, LE3;->S:I

    new-instance v2, Lr3;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Lr3;-><init>(LE3;I)V

    iput-object v2, p0, LE3;->a0:Lr3;

    iput-object p1, p0, LE3;->k:Landroid/content/Context;

    iput-object p3, p0, LE3;->n:Ljava/lang/Object;

    iput-object p4, p0, LE3;->j:Ljava/lang/Object;

    instance-of p3, p4, Landroid/app/Dialog;

    if-eqz p3, :cond_2

    :goto_0
    if-eqz p1, :cond_1

    instance-of p3, p1, Lc3;

    if-eqz p3, :cond_0

    move-object v0, p1

    check-cast v0, Lc3;

    goto :goto_1

    :cond_0
    instance-of p3, p1, Landroid/content/ContextWrapper;

    if-eqz p3, :cond_1

    check-cast p1, Landroid/content/ContextWrapper;

    invoke-virtual {p1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object p1

    goto :goto_0

    :cond_1
    :goto_1
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lc3;->getDelegate()Lq3;

    move-result-object p1

    check-cast p1, LE3;

    iget p1, p1, LE3;->S:I

    iput p1, p0, LE3;->S:I

    :cond_2
    iget p1, p0, LE3;->S:I

    if-ne p1, v1, :cond_3

    iget-object p1, p0, LE3;->j:Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    sget-object p3, LE3;->h0:Lsy;

    invoke-virtual {p3, p1}, Lsy;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, p0, LE3;->S:I

    iget-object p1, p0, LE3;->j:Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Lsy;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    if-eqz p2, :cond_4

    invoke-virtual {p0, p2}, LE3;->o(Landroid/view/Window;)V

    :cond_4
    invoke-static {}, LG3;->d()V

    return-void
.end method

.method public static p(Landroid/content/Context;)LZo;
    .locals 5

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lq3;->c:LZo;

    if-nez v0, :cond_1

    :goto_0
    const/4 p0, 0x0

    return-object p0

    :cond_1
    iget-object v0, v0, LZo;->a:Lap;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p0

    invoke-static {p0}, Lv3;->b(Landroid/content/res/Configuration;)LZo;

    move-result-object p0

    iget-object v1, v0, Lap;->a:Landroid/os/LocaleList;

    invoke-virtual {v1}, Landroid/os/LocaleList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    sget-object v0, LZo;->b:LZo;

    goto :goto_3

    :cond_2
    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    const/4 v2, 0x0

    :goto_1
    iget-object v3, v0, Lap;->a:Landroid/os/LocaleList;

    invoke-virtual {v3}, Landroid/os/LocaleList;->size()I

    move-result v3

    iget-object v4, p0, LZo;->a:Lap;

    iget-object v4, v4, Lap;->a:Landroid/os/LocaleList;

    invoke-virtual {v4}, Landroid/os/LocaleList;->size()I

    move-result v4

    add-int/2addr v4, v3

    if-ge v2, v4, :cond_5

    iget-object v3, v0, Lap;->a:Landroid/os/LocaleList;

    invoke-virtual {v3}, Landroid/os/LocaleList;->size()I

    move-result v3

    if-ge v2, v3, :cond_3

    iget-object v3, v0, Lap;->a:Landroid/os/LocaleList;

    invoke-virtual {v3, v2}, Landroid/os/LocaleList;->get(I)Ljava/util/Locale;

    move-result-object v3

    goto :goto_2

    :cond_3
    iget-object v3, v0, Lap;->a:Landroid/os/LocaleList;

    invoke-virtual {v3}, Landroid/os/LocaleList;->size()I

    move-result v3

    sub-int v3, v2, v3

    iget-object v4, p0, LZo;->a:Lap;

    iget-object v4, v4, Lap;->a:Landroid/os/LocaleList;

    invoke-virtual {v4, v3}, Landroid/os/LocaleList;->get(I)Ljava/util/Locale;

    move-result-object v3

    :goto_2
    if-eqz v3, :cond_4

    invoke-interface {v1, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_5
    invoke-interface {v1}, Ljava/util/Set;->size()I

    move-result v0

    new-array v0, v0, [Ljava/util/Locale;

    invoke-interface {v1, v0}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/util/Locale;

    new-instance v1, Landroid/os/LocaleList;

    invoke-direct {v1, v0}, Landroid/os/LocaleList;-><init>([Ljava/util/Locale;)V

    new-instance v0, LZo;

    new-instance v2, Lap;

    invoke-direct {v2, v1}, Lap;-><init>(Landroid/os/LocaleList;)V

    invoke-direct {v0, v2}, LZo;-><init>(Lap;)V

    :goto_3
    iget-object v1, v0, LZo;->a:Lap;

    iget-object v1, v1, Lap;->a:Landroid/os/LocaleList;

    invoke-virtual {v1}, Landroid/os/LocaleList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_6

    return-object p0

    :cond_6
    return-object v0
.end method

.method public static t(Landroid/content/Context;ILZo;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;
    .locals 1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    if-eqz p4, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p0

    iget p0, p0, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 p0, p0, 0x30

    goto :goto_0

    :cond_1
    const/16 p0, 0x20

    goto :goto_0

    :cond_2
    const/16 p0, 0x10

    :goto_0
    new-instance p1, Landroid/content/res/Configuration;

    invoke-direct {p1}, Landroid/content/res/Configuration;-><init>()V

    const/4 p4, 0x0

    iput p4, p1, Landroid/content/res/Configuration;->fontScale:F

    if-eqz p3, :cond_3

    invoke-virtual {p1, p3}, Landroid/content/res/Configuration;->setTo(Landroid/content/res/Configuration;)V

    :cond_3
    iget p3, p1, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 p3, p3, -0x31

    or-int/2addr p0, p3

    iput p0, p1, Landroid/content/res/Configuration;->uiMode:I

    if-eqz p2, :cond_4

    invoke-static {p1, p2}, Lv3;->d(Landroid/content/res/Configuration;LZo;)V

    :cond_4
    return-object p1
.end method


# virtual methods
.method public final A()V
    .locals 3

    invoke-virtual {p0}, LE3;->w()V

    iget-boolean v0, p0, LE3;->F:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, LE3;->o:Ln0;

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, LE3;->j:Ljava/lang/Object;

    instance-of v1, v0, Landroid/app/Activity;

    if-eqz v1, :cond_1

    new-instance v1, LmF;

    check-cast v0, Landroid/app/Activity;

    iget-boolean v2, p0, LE3;->G:Z

    invoke-direct {v1, v0, v2}, LmF;-><init>(Landroid/app/Activity;Z)V

    iput-object v1, p0, LE3;->o:Ln0;

    goto :goto_0

    :cond_1
    instance-of v1, v0, Landroid/app/Dialog;

    if-eqz v1, :cond_2

    new-instance v1, LmF;

    check-cast v0, Landroid/app/Dialog;

    invoke-direct {v1, v0}, LmF;-><init>(Landroid/app/Dialog;)V

    iput-object v1, p0, LE3;->o:Ln0;

    :cond_2
    :goto_0
    iget-object v0, p0, LE3;->o:Ln0;

    if-eqz v0, :cond_3

    iget-boolean v1, p0, LE3;->b0:Z

    invoke-virtual {v0, v1}, Ln0;->m(Z)V

    :cond_3
    :goto_1
    return-void
.end method

.method public final B(I)V
    .locals 2

    iget v0, p0, LE3;->Z:I

    const/4 v1, 0x1

    shl-int p1, v1, p1

    or-int/2addr p1, v0

    iput p1, p0, LE3;->Z:I

    iget-boolean p1, p0, LE3;->Y:Z

    if-nez p1, :cond_0

    iget-object p1, p0, LE3;->l:Landroid/view/Window;

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    sget-object v0, LlE;->a:Ljava/util/WeakHashMap;

    iget-object v0, p0, LE3;->a0:Lr3;

    invoke-virtual {p1, v0}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    iput-boolean v1, p0, LE3;->Y:Z

    :cond_0
    return-void
.end method

.method public final C(Landroid/content/Context;I)I
    .locals 2

    const/16 v0, -0x64

    const/4 v1, -0x1

    if-eq p2, v0, :cond_5

    if-eq p2, v1, :cond_4

    if-eqz p2, :cond_2

    const/4 v0, 0x1

    if-eq p2, v0, :cond_4

    const/4 v0, 0x2

    if-eq p2, v0, :cond_4

    const/4 v0, 0x3

    if-ne p2, v0, :cond_1

    iget-object p2, p0, LE3;->X:Lz3;

    if-nez p2, :cond_0

    new-instance p2, Lz3;

    invoke-direct {p2, p0, p1}, Lz3;-><init>(LE3;Landroid/content/Context;)V

    iput-object p2, p0, LE3;->X:Lz3;

    :cond_0
    iget-object p1, p0, LE3;->X:Lz3;

    invoke-virtual {p1}, Lz3;->h()I

    move-result p1

    return p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p2

    const-string v0, "uimode"

    invoke-virtual {p2, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/app/UiModeManager;

    invoke-virtual {p2}, Landroid/app/UiModeManager;->getNightMode()I

    move-result p2

    if-nez p2, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {p0, p1}, LE3;->y(Landroid/content/Context;)LB3;

    move-result-object p1

    invoke-virtual {p1}, LB3;->h()I

    move-result p1

    return p1

    :cond_4
    return p2

    :cond_5
    :goto_0
    return v1
.end method

.method public final D()Z
    .locals 5

    iget-boolean v0, p0, LE3;->N:Z

    const/4 v1, 0x0

    iput-boolean v1, p0, LE3;->N:Z

    invoke-virtual {p0, v1}, LE3;->z(I)LD3;

    move-result-object v2

    iget-boolean v3, v2, LD3;->m:Z

    const/4 v4, 0x1

    if-eqz v3, :cond_0

    if-nez v0, :cond_2

    invoke-virtual {p0, v2, v4}, LE3;->s(LD3;Z)V

    return v4

    :cond_0
    iget-object v0, p0, LE3;->u:LI0;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LI0;->a()V

    return v4

    :cond_1
    invoke-virtual {p0}, LE3;->A()V

    iget-object v0, p0, LE3;->o:Ln0;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ln0;->b()Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    return v4

    :cond_3
    return v1
.end method

.method public final E(LD3;Landroid/view/KeyEvent;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-boolean v2, v1, LD3;->m:Z

    iget v3, v1, LD3;->a:I

    if-nez v2, :cond_1a

    iget-boolean v2, v0, LE3;->Q:Z

    if-eqz v2, :cond_0

    goto/16 :goto_9

    :cond_0
    iget-object v2, v0, LE3;->k:Landroid/content/Context;

    if-nez v3, :cond_1

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v4

    iget v4, v4, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit8 v4, v4, 0xf

    const/4 v5, 0x4

    if-ne v4, v5, :cond_1

    goto/16 :goto_9

    :cond_1
    iget-object v4, v0, LE3;->l:Landroid/view/Window;

    invoke-virtual {v4}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v4

    const/4 v5, 0x1

    if-eqz v4, :cond_2

    iget-object v6, v1, LD3;->h:Llr;

    invoke-interface {v4, v3, v6}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    move-result v4

    if-nez v4, :cond_2

    invoke-virtual {v0, v1, v5}, LE3;->s(LD3;Z)V

    return-void

    :cond_2
    const-string v4, "window"

    invoke-virtual {v2, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/view/WindowManager;

    if-nez v4, :cond_3

    goto/16 :goto_9

    :cond_3
    invoke-virtual/range {p0 .. p2}, LE3;->G(LD3;Landroid/view/KeyEvent;)Z

    move-result v6

    if-nez v6, :cond_4

    goto/16 :goto_9

    :cond_4
    iget-object v6, v1, LD3;->e:LC3;

    const/4 v7, 0x0

    const/4 v8, -0x2

    if-eqz v6, :cond_6

    iget-boolean v9, v1, LD3;->n:Z

    if-eqz v9, :cond_5

    goto :goto_0

    :cond_5
    iget-object v2, v1, LD3;->g:Landroid/view/View;

    if-eqz v2, :cond_18

    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    if-eqz v2, :cond_18

    iget v2, v2, Landroid/view/ViewGroup$LayoutParams;->width:I

    const/4 v6, -0x1

    if-ne v2, v6, :cond_18

    move v10, v6

    goto/16 :goto_7

    :cond_6
    :goto_0
    if-nez v6, :cond_b

    invoke-virtual {v0}, LE3;->A()V

    iget-object v6, v0, LE3;->o:Ln0;

    if-eqz v6, :cond_7

    invoke-virtual {v6}, Ln0;->e()Landroid/content/Context;

    move-result-object v6

    goto :goto_1

    :cond_7
    const/4 v6, 0x0

    :goto_1
    if-nez v6, :cond_8

    goto :goto_2

    :cond_8
    move-object v2, v6

    :goto_2
    new-instance v6, Landroid/util/TypedValue;

    invoke-direct {v6}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v9

    invoke-virtual {v9}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    move-result-object v9

    invoke-virtual {v2}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v10

    invoke-virtual {v9, v10}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    const v10, 0x55040004

    invoke-virtual {v9, v10, v6, v5}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget v10, v6, Landroid/util/TypedValue;->resourceId:I

    if-eqz v10, :cond_9

    invoke-virtual {v9, v10, v5}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    :cond_9
    const v10, 0x550403ef

    invoke-virtual {v9, v10, v6, v5}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget v6, v6, Landroid/util/TypedValue;->resourceId:I

    if-eqz v6, :cond_a

    invoke-virtual {v9, v6, v5}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    goto :goto_3

    :cond_a
    const v6, 0x55120276

    invoke-virtual {v9, v6, v5}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    :goto_3
    new-instance v6, LDb;

    invoke-direct {v6, v2, v7}, LDb;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v6}, LDb;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v2

    invoke-virtual {v2, v9}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    iput-object v6, v1, LD3;->j:LDb;

    sget-object v2, LWu;->j:[I

    invoke-virtual {v6, v2}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v2

    const/16 v6, 0x56

    invoke-virtual {v2, v6, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v6

    iput v6, v1, LD3;->b:I

    invoke-virtual {v2, v5, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v6

    iput v6, v1, LD3;->d:I

    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    new-instance v2, LC3;

    iget-object v6, v1, LD3;->j:LDb;

    invoke-direct {v2, v0, v6}, LC3;-><init>(LE3;LDb;)V

    iput-object v2, v1, LD3;->e:LC3;

    const/16 v2, 0x51

    iput v2, v1, LD3;->c:I

    goto :goto_4

    :cond_b
    iget-boolean v2, v1, LD3;->n:Z

    if-eqz v2, :cond_c

    invoke-virtual {v6}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    if-lez v2, :cond_c

    iget-object v2, v1, LD3;->e:LC3;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->removeAllViews()V

    :cond_c
    :goto_4
    iget-object v2, v1, LD3;->g:Landroid/view/View;

    if-eqz v2, :cond_d

    iput-object v2, v1, LD3;->f:Landroid/view/View;

    goto :goto_5

    :cond_d
    iget-object v2, v1, LD3;->h:Llr;

    if-nez v2, :cond_e

    goto/16 :goto_8

    :cond_e
    iget-object v2, v0, LE3;->t:Ls3;

    if-nez v2, :cond_f

    new-instance v2, Ls3;

    const/4 v6, 0x3

    invoke-direct {v2, v0, v6}, Ls3;-><init>(LE3;I)V

    iput-object v2, v0, LE3;->t:Ls3;

    :cond_f
    iget-object v2, v0, LE3;->t:Ls3;

    iget-object v6, v1, LD3;->i:Lyo;

    if-nez v6, :cond_10

    new-instance v6, Lyo;

    iget-object v9, v1, LD3;->j:LDb;

    invoke-direct {v6, v9}, Lyo;-><init>(Landroid/content/Context;)V

    iput-object v6, v1, LD3;->i:Lyo;

    iput-object v2, v6, Lyo;->e:LCr;

    iget-object v2, v1, LD3;->h:Llr;

    iget-object v9, v2, Llr;->a:Landroid/content/Context;

    invoke-virtual {v2, v6, v9}, Llr;->b(LDr;Landroid/content/Context;)V

    :cond_10
    iget-object v2, v1, LD3;->i:Lyo;

    iget-object v6, v1, LD3;->e:LC3;

    iget-object v9, v2, Lyo;->d:Landroidx/appcompat/view/menu/ExpandedMenuView;

    if-nez v9, :cond_12

    iget-object v9, v2, Lyo;->b:Landroid/view/LayoutInflater;

    const v10, 0x550d000d

    invoke-virtual {v9, v10, v6, v7}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroidx/appcompat/view/menu/ExpandedMenuView;

    iput-object v6, v2, Lyo;->d:Landroidx/appcompat/view/menu/ExpandedMenuView;

    iget-object v6, v2, Lyo;->f:Lxo;

    if-nez v6, :cond_11

    new-instance v6, Lxo;

    invoke-direct {v6, v2}, Lxo;-><init>(Lyo;)V

    iput-object v6, v2, Lyo;->f:Lxo;

    :cond_11
    iget-object v6, v2, Lyo;->d:Landroidx/appcompat/view/menu/ExpandedMenuView;

    iget-object v9, v2, Lyo;->f:Lxo;

    invoke-virtual {v6, v9}, Landroid/widget/AbsListView;->setAdapter(Landroid/widget/ListAdapter;)V

    iget-object v6, v2, Lyo;->d:Landroidx/appcompat/view/menu/ExpandedMenuView;

    invoke-virtual {v6, v2}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    :cond_12
    iget-object v2, v2, Lyo;->d:Landroidx/appcompat/view/menu/ExpandedMenuView;

    iput-object v2, v1, LD3;->f:Landroid/view/View;

    if-eqz v2, :cond_19

    :goto_5
    iget-object v2, v1, LD3;->f:Landroid/view/View;

    if-nez v2, :cond_13

    goto/16 :goto_8

    :cond_13
    iget-object v2, v1, LD3;->g:Landroid/view/View;

    if-eqz v2, :cond_14

    goto :goto_6

    :cond_14
    iget-object v2, v1, LD3;->i:Lyo;

    iget-object v6, v2, Lyo;->f:Lxo;

    if-nez v6, :cond_15

    new-instance v6, Lxo;

    invoke-direct {v6, v2}, Lxo;-><init>(Lyo;)V

    iput-object v6, v2, Lyo;->f:Lxo;

    :cond_15
    iget-object v2, v2, Lyo;->f:Lxo;

    invoke-virtual {v2}, Lxo;->getCount()I

    move-result v2

    if-lez v2, :cond_19

    :goto_6
    iget-object v2, v1, LD3;->f:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    if-nez v2, :cond_16

    new-instance v2, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v2, v8, v8}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    :cond_16
    iget v6, v1, LD3;->b:I

    iget-object v9, v1, LD3;->e:LC3;

    invoke-virtual {v9, v6}, LC3;->setBackgroundResource(I)V

    iget-object v6, v1, LD3;->f:Landroid/view/View;

    invoke-virtual {v6}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v6

    instance-of v9, v6, Landroid/view/ViewGroup;

    if-eqz v9, :cond_17

    check-cast v6, Landroid/view/ViewGroup;

    iget-object v9, v1, LD3;->f:Landroid/view/View;

    invoke-virtual {v6, v9}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_17
    iget-object v6, v1, LD3;->e:LC3;

    iget-object v9, v1, LD3;->f:Landroid/view/View;

    invoke-virtual {v6, v9, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v2, v1, LD3;->f:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->hasFocus()Z

    move-result v2

    if-nez v2, :cond_18

    iget-object v2, v1, LD3;->f:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->requestFocus()Z

    :cond_18
    move v10, v8

    :goto_7
    iput-boolean v7, v1, LD3;->l:Z

    new-instance v9, Landroid/view/WindowManager$LayoutParams;

    const/high16 v15, 0x820000

    const/16 v16, -0x3

    const/4 v11, -0x2

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v14, 0x3ea

    invoke-direct/range {v9 .. v16}, Landroid/view/WindowManager$LayoutParams;-><init>(IIIIIII)V

    iget v2, v1, LD3;->c:I

    iput v2, v9, Landroid/view/WindowManager$LayoutParams;->gravity:I

    iget v2, v1, LD3;->d:I

    iput v2, v9, Landroid/view/WindowManager$LayoutParams;->windowAnimations:I

    iget-object v2, v1, LD3;->e:LC3;

    invoke-interface {v4, v2, v9}, Landroid/view/ViewManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iput-boolean v5, v1, LD3;->m:Z

    if-nez v3, :cond_1a

    invoke-virtual {v0}, LE3;->I()V

    return-void

    :cond_19
    :goto_8
    iput-boolean v5, v1, LD3;->n:Z

    :cond_1a
    :goto_9
    return-void
.end method

.method public final F(LD3;ILandroid/view/KeyEvent;)Z
    .locals 2

    invoke-virtual {p3}, Landroid/view/KeyEvent;->isSystem()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-boolean v0, p1, LD3;->k:Z

    if-nez v0, :cond_1

    invoke-virtual {p0, p1, p3}, LE3;->G(LD3;Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    iget-object p1, p1, LD3;->h:Llr;

    if-eqz p1, :cond_2

    const/4 v0, 0x1

    invoke-virtual {p1, p2, p3, v0}, Llr;->performShortcut(ILandroid/view/KeyEvent;I)Z

    move-result v1

    :cond_2
    return v1
.end method

.method public final G(LD3;Landroid/view/KeyEvent;)Z
    .locals 12

    iget-boolean v0, p0, LE3;->Q:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto/16 :goto_5

    :cond_0
    iget-boolean v0, p1, LD3;->k:Z

    iget v2, p1, LD3;->a:I

    const/4 v3, 0x1

    if-eqz v0, :cond_1

    return v3

    :cond_1
    iget-object v0, p0, LE3;->M:LD3;

    if-eqz v0, :cond_2

    if-eq v0, p1, :cond_2

    invoke-virtual {p0, v0, v1}, LE3;->s(LD3;Z)V

    :cond_2
    iget-object v0, p0, LE3;->l:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-interface {v0, v2}, Landroid/view/Window$Callback;->onCreatePanelView(I)Landroid/view/View;

    move-result-object v4

    iput-object v4, p1, LD3;->g:Landroid/view/View;

    :cond_3
    const/16 v4, 0x6c

    if-eqz v2, :cond_5

    if-ne v2, v4, :cond_4

    goto :goto_0

    :cond_4
    move v5, v1

    goto :goto_1

    :cond_5
    :goto_0
    move v5, v3

    :goto_1
    if-eqz v5, :cond_6

    iget-object v6, p0, LE3;->r:LKc;

    if-eqz v6, :cond_6

    check-cast v6, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {v6}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k()V

    iget-object v6, v6, Landroidx/appcompat/widget/ActionBarOverlayLayout;->e:LLc;

    check-cast v6, LwB;

    iput-boolean v3, v6, LwB;->l:Z

    :cond_6
    iget-object v6, p1, LD3;->g:Landroid/view/View;

    if-nez v6, :cond_1e

    if-eqz v5, :cond_7

    iget-object v6, p0, LE3;->o:Ln0;

    instance-of v6, v6, LuB;

    if-nez v6, :cond_1e

    :cond_7
    iget-object v6, p1, LD3;->h:Llr;

    const/4 v7, 0x0

    if-eqz v6, :cond_8

    iget-boolean v8, p1, LD3;->o:Z

    if-eqz v8, :cond_18

    :cond_8
    if-nez v6, :cond_11

    iget-object v6, p0, LE3;->k:Landroid/content/Context;

    if-eqz v2, :cond_9

    if-ne v2, v4, :cond_d

    :cond_9
    iget-object v4, p0, LE3;->r:LKc;

    if-eqz v4, :cond_d

    new-instance v4, Landroid/util/TypedValue;

    invoke-direct {v4}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {v6}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v8

    const v9, 0x5504000b

    invoke-virtual {v8, v9, v4, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget v9, v4, Landroid/util/TypedValue;->resourceId:I

    const v10, 0x5504000c

    if-eqz v9, :cond_a

    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v9

    invoke-virtual {v9}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    move-result-object v9

    invoke-virtual {v9, v8}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    iget v11, v4, Landroid/util/TypedValue;->resourceId:I

    invoke-virtual {v9, v11, v3}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    invoke-virtual {v9, v10, v4, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    goto :goto_2

    :cond_a
    invoke-virtual {v8, v10, v4, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    move-object v9, v7

    :goto_2
    iget v10, v4, Landroid/util/TypedValue;->resourceId:I

    if-eqz v10, :cond_c

    if-nez v9, :cond_b

    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v9

    invoke-virtual {v9}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    move-result-object v9

    invoke-virtual {v9, v8}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    :cond_b
    iget v4, v4, Landroid/util/TypedValue;->resourceId:I

    invoke-virtual {v9, v4, v3}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    :cond_c
    if-eqz v9, :cond_d

    new-instance v4, LDb;

    invoke-direct {v4, v6, v1}, LDb;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v4}, LDb;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v6

    invoke-virtual {v6, v9}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    move-object v6, v4

    :cond_d
    new-instance v4, Llr;

    invoke-direct {v4, v6}, Llr;-><init>(Landroid/content/Context;)V

    iput-object p0, v4, Llr;->e:Ljr;

    iget-object v6, p1, LD3;->h:Llr;

    if-ne v4, v6, :cond_e

    goto :goto_3

    :cond_e
    if-eqz v6, :cond_f

    iget-object v8, p1, LD3;->i:Lyo;

    invoke-virtual {v6, v8}, Llr;->r(LDr;)V

    :cond_f
    iput-object v4, p1, LD3;->h:Llr;

    iget-object v6, p1, LD3;->i:Lyo;

    if-eqz v6, :cond_10

    iget-object v8, v4, Llr;->a:Landroid/content/Context;

    invoke-virtual {v4, v6, v8}, Llr;->b(LDr;Landroid/content/Context;)V

    :cond_10
    :goto_3
    iget-object v4, p1, LD3;->h:Llr;

    if-nez v4, :cond_11

    goto :goto_5

    :cond_11
    if-eqz v5, :cond_13

    iget-object v4, p0, LE3;->r:LKc;

    if-eqz v4, :cond_13

    iget-object v6, p0, LE3;->s:Ls3;

    if-nez v6, :cond_12

    new-instance v6, Ls3;

    const/4 v8, 0x2

    invoke-direct {v6, p0, v8}, Ls3;-><init>(LE3;I)V

    iput-object v6, p0, LE3;->s:Ls3;

    :cond_12
    iget-object v6, p1, LD3;->h:Llr;

    iget-object v8, p0, LE3;->s:Ls3;

    check-cast v4, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {v4, v6, v8}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->l(Landroid/view/Menu;LCr;)V

    :cond_13
    iget-object v4, p1, LD3;->h:Llr;

    invoke-virtual {v4}, Llr;->w()V

    iget-object v4, p1, LD3;->h:Llr;

    invoke-interface {v0, v2, v4}, Landroid/view/Window$Callback;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    move-result v2

    if-nez v2, :cond_17

    iget-object p2, p1, LD3;->h:Llr;

    if-nez p2, :cond_14

    goto :goto_4

    :cond_14
    if-eqz p2, :cond_15

    iget-object v0, p1, LD3;->i:Lyo;

    invoke-virtual {p2, v0}, Llr;->r(LDr;)V

    :cond_15
    iput-object v7, p1, LD3;->h:Llr;

    :goto_4
    if-eqz v5, :cond_16

    iget-object p1, p0, LE3;->r:LKc;

    if-eqz p1, :cond_16

    iget-object p2, p0, LE3;->s:Ls3;

    check-cast p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {p1, v7, p2}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->l(Landroid/view/Menu;LCr;)V

    :cond_16
    :goto_5
    return v1

    :cond_17
    iput-boolean v1, p1, LD3;->o:Z

    :cond_18
    iget-object v2, p1, LD3;->h:Llr;

    invoke-virtual {v2}, Llr;->w()V

    iget-object v2, p1, LD3;->p:Landroid/os/Bundle;

    if-eqz v2, :cond_19

    iget-object v4, p1, LD3;->h:Llr;

    invoke-virtual {v4, v2}, Llr;->s(Landroid/os/Bundle;)V

    iput-object v7, p1, LD3;->p:Landroid/os/Bundle;

    :cond_19
    iget-object v2, p1, LD3;->g:Landroid/view/View;

    iget-object v4, p1, LD3;->h:Llr;

    invoke-interface {v0, v1, v2, v4}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result v0

    if-nez v0, :cond_1b

    if-eqz v5, :cond_1a

    iget-object p2, p0, LE3;->r:LKc;

    if-eqz p2, :cond_1a

    iget-object v0, p0, LE3;->s:Ls3;

    check-cast p2, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {p2, v7, v0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->l(Landroid/view/Menu;LCr;)V

    :cond_1a
    iget-object p1, p1, LD3;->h:Llr;

    invoke-virtual {p1}, Llr;->v()V

    return v1

    :cond_1b
    if-eqz p2, :cond_1c

    invoke-virtual {p2}, Landroid/view/KeyEvent;->getDeviceId()I

    move-result p2

    goto :goto_6

    :cond_1c
    const/4 p2, -0x1

    :goto_6
    invoke-static {p2}, Landroid/view/KeyCharacterMap;->load(I)Landroid/view/KeyCharacterMap;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/KeyCharacterMap;->getKeyboardType()I

    move-result p2

    if-eq p2, v3, :cond_1d

    move p2, v3

    goto :goto_7

    :cond_1d
    move p2, v1

    :goto_7
    iget-object v0, p1, LD3;->h:Llr;

    invoke-virtual {v0, p2}, Llr;->setQwertyMode(Z)V

    iget-object p2, p1, LD3;->h:Llr;

    invoke-virtual {p2}, Llr;->v()V

    :cond_1e
    iput-boolean v3, p1, LD3;->k:Z

    iput-boolean v1, p1, LD3;->l:Z

    iput-object p1, p0, LE3;->M:LD3;

    return v3
.end method

.method public final H()V
    .locals 2

    iget-boolean v0, p0, LE3;->z:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Landroid/util/AndroidRuntimeException;

    const-string v1, "Window feature must be requested before adding content"

    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final I()V
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_4

    iget-object v0, p0, LE3;->f0:Landroid/window/OnBackInvokedDispatcher;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0, v1}, LE3;->z(I)LD3;

    move-result-object v0

    iget-boolean v0, v0, LD3;->m:Z

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    :goto_0
    move v1, v2

    goto :goto_1

    :cond_1
    iget-object v0, p0, LE3;->u:LI0;

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    :goto_1
    if-eqz v1, :cond_3

    iget-object v0, p0, LE3;->g0:Landroid/window/OnBackInvokedCallback;

    if-nez v0, :cond_3

    iget-object v0, p0, LE3;->f0:Landroid/window/OnBackInvokedDispatcher;

    invoke-static {v0, p0}, Lx3;->b(Ljava/lang/Object;LE3;)Landroid/window/OnBackInvokedCallback;

    move-result-object v0

    iput-object v0, p0, LE3;->g0:Landroid/window/OnBackInvokedCallback;

    return-void

    :cond_3
    if-nez v1, :cond_4

    iget-object v0, p0, LE3;->g0:Landroid/window/OnBackInvokedCallback;

    if-eqz v0, :cond_4

    iget-object v1, p0, LE3;->f0:Landroid/window/OnBackInvokedDispatcher;

    invoke-static {v1, v0}, Lx3;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v0, 0x0

    iput-object v0, p0, LE3;->g0:Landroid/window/OnBackInvokedCallback;

    :cond_4
    return-void
.end method

.method public final a()V
    .locals 1

    iget-object v0, p0, LE3;->o:Ln0;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, LE3;->A()V

    iget-object v0, p0, LE3;->o:Ln0;

    invoke-virtual {v0}, Ln0;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, LE3;->B(I)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final c()V
    .locals 4

    const/4 v0, 0x1

    iput-boolean v0, p0, LE3;->O:Z

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, LE3;->m(ZZ)Z

    invoke-virtual {p0}, LE3;->x()V

    iget-object v1, p0, LE3;->j:Ljava/lang/Object;

    instance-of v2, v1, Landroid/app/Activity;

    if-eqz v2, :cond_2

    :try_start_0
    check-cast v1, Landroid/app/Activity;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    invoke-virtual {v1}, Landroid/app/Activity;->getComponentName()Landroid/content/ComponentName;

    move-result-object v2

    invoke-static {v1, v2}, Lcr;->A(Landroid/content/Context;Landroid/content/ComponentName;)Ljava/lang/String;

    move-result-object v1
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_0
    move-exception v1

    :try_start_2
    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw v2
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    iget-object v1, p0, LE3;->o:Ln0;

    if-nez v1, :cond_0

    iput-boolean v0, p0, LE3;->b0:Z

    goto :goto_1

    :cond_0
    invoke-virtual {v1, v0}, Ln0;->m(Z)V

    :cond_1
    :goto_1
    sget-object v1, Lq3;->h:Ljava/lang/Object;

    monitor-enter v1

    :try_start_3
    invoke-static {p0}, Lq3;->f(LE3;)V

    sget-object v2, Lq3;->g:LO4;

    new-instance v3, Ljava/lang/ref/WeakReference;

    invoke-direct {v3, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v2, v3}, LO4;->add(Ljava/lang/Object;)Z

    monitor-exit v1

    goto :goto_2

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0

    :cond_2
    :goto_2
    new-instance v1, Landroid/content/res/Configuration;

    iget-object v2, p0, LE3;->k:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    iput-object v1, p0, LE3;->R:Landroid/content/res/Configuration;

    iput-boolean v0, p0, LE3;->P:Z

    return-void
.end method

.method public final d(Llr;Landroid/view/MenuItem;)Z
    .locals 7

    iget-object v0, p0, LE3;->l:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    iget-boolean v2, p0, LE3;->Q:Z

    if-nez v2, :cond_3

    invoke-virtual {p1}, Llr;->k()Llr;

    move-result-object p1

    iget-object v2, p0, LE3;->L:[LD3;

    if-eqz v2, :cond_0

    array-length v3, v2

    goto :goto_0

    :cond_0
    move v3, v1

    :goto_0
    move v4, v1

    :goto_1
    if-ge v4, v3, :cond_2

    aget-object v5, v2, v4

    if-eqz v5, :cond_1

    iget-object v6, v5, LD3;->h:Llr;

    if-ne v6, p1, :cond_1

    goto :goto_2

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_2
    const/4 v5, 0x0

    :goto_2
    if-eqz v5, :cond_3

    iget p1, v5, LD3;->a:I

    invoke-interface {v0, p1, p2}, Landroid/view/Window$Callback;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    move-result p1

    return p1

    :cond_3
    return v1
.end method

.method public final e()V
    .locals 3

    iget-object v0, p0, LE3;->j:Ljava/lang/Object;

    instance-of v0, v0, Landroid/app/Activity;

    if-eqz v0, :cond_0

    sget-object v0, Lq3;->h:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-static {p0}, Lq3;->f(LE3;)V

    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_0
    :goto_0
    iget-boolean v0, p0, LE3;->Y:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, LE3;->l:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, LE3;->a0:Lr3;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, LE3;->Q:Z

    iget v0, p0, LE3;->S:I

    const/16 v1, -0x64

    if-eq v0, v1, :cond_2

    iget-object v0, p0, LE3;->j:Ljava/lang/Object;

    instance-of v1, v0, Landroid/app/Activity;

    if-eqz v1, :cond_2

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isChangingConfigurations()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, LE3;->h0:Lsy;

    iget-object v1, p0, LE3;->j:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    iget v2, p0, LE3;->S:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lsy;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_2
    sget-object v0, LE3;->h0:Lsy;

    iget-object v1, p0, LE3;->j:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lsy;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    iget-object v0, p0, LE3;->o:Ln0;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ln0;->i()V

    :cond_3
    iget-object v0, p0, LE3;->W:Lz3;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, LB3;->c()V

    :cond_4
    iget-object v0, p0, LE3;->X:Lz3;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, LB3;->c()V

    :cond_5
    return-void
.end method

.method public final g(I)Z
    .locals 5

    const/16 v0, 0x8

    const/16 v1, 0x6d

    const/16 v2, 0x6c

    if-ne p1, v0, :cond_0

    move p1, v2

    goto :goto_0

    :cond_0
    const/16 v0, 0x9

    if-ne p1, v0, :cond_1

    move p1, v1

    :cond_1
    :goto_0
    iget-boolean v0, p0, LE3;->J:Z

    const/4 v3, 0x0

    if-eqz v0, :cond_2

    if-ne p1, v2, :cond_2

    return v3

    :cond_2
    iget-boolean v0, p0, LE3;->F:Z

    const/4 v4, 0x1

    if-eqz v0, :cond_3

    if-ne p1, v4, :cond_3

    iput-boolean v3, p0, LE3;->F:Z

    :cond_3
    if-eq p1, v4, :cond_9

    const/4 v0, 0x2

    if-eq p1, v0, :cond_8

    const/4 v0, 0x5

    if-eq p1, v0, :cond_7

    const/16 v0, 0xa

    if-eq p1, v0, :cond_6

    if-eq p1, v2, :cond_5

    if-eq p1, v1, :cond_4

    iget-object v0, p0, LE3;->l:Landroid/view/Window;

    invoke-virtual {v0, p1}, Landroid/view/Window;->requestFeature(I)Z

    move-result p1

    return p1

    :cond_4
    invoke-virtual {p0}, LE3;->H()V

    iput-boolean v4, p0, LE3;->G:Z

    return v4

    :cond_5
    invoke-virtual {p0}, LE3;->H()V

    iput-boolean v4, p0, LE3;->F:Z

    return v4

    :cond_6
    invoke-virtual {p0}, LE3;->H()V

    iput-boolean v4, p0, LE3;->H:Z

    return v4

    :cond_7
    invoke-virtual {p0}, LE3;->H()V

    iput-boolean v4, p0, LE3;->E:Z

    return v4

    :cond_8
    invoke-virtual {p0}, LE3;->H()V

    iput-boolean v4, p0, LE3;->D:Z

    return v4

    :cond_9
    invoke-virtual {p0}, LE3;->H()V

    iput-boolean v4, p0, LE3;->J:Z

    return v4
.end method

.method public final h(I)V
    .locals 2

    invoke-virtual {p0}, LE3;->w()V

    iget-object v0, p0, LE3;->A:Landroid/view/ViewGroup;

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    iget-object v1, p0, LE3;->k:Landroid/content/Context;

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    invoke-virtual {v1, p1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    iget-object p1, p0, LE3;->m:Ly3;

    iget-object v0, p0, LE3;->l:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v0

    invoke-virtual {p1, v0}, Ly3;->a(Landroid/view/Window$Callback;)V

    return-void
.end method

.method public final i(Landroid/view/View;)V
    .locals 2

    invoke-virtual {p0}, LE3;->w()V

    iget-object v0, p0, LE3;->A:Landroid/view/ViewGroup;

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object p1, p0, LE3;->m:Ly3;

    iget-object v0, p0, LE3;->l:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v0

    invoke-virtual {p1, v0}, Ly3;->a(Landroid/view/Window$Callback;)V

    return-void
.end method

.method public final j(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 2

    invoke-virtual {p0}, LE3;->w()V

    iget-object v0, p0, LE3;->A:Landroid/view/ViewGroup;

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    invoke-virtual {v0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object p1, p0, LE3;->m:Ly3;

    iget-object p2, p0, LE3;->l:Landroid/view/Window;

    invoke-virtual {p2}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object p2

    invoke-virtual {p1, p2}, Ly3;->a(Landroid/view/Window$Callback;)V

    return-void
.end method

.method public final k(Ljava/lang/CharSequence;)V
    .locals 1

    iput-object p1, p0, LE3;->q:Ljava/lang/CharSequence;

    iget-object v0, p0, LE3;->r:LKc;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, LKc;->setWindowTitle(Ljava/lang/CharSequence;)V

    return-void

    :cond_0
    iget-object v0, p0, LE3;->o:Ln0;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Ln0;->o(Ljava/lang/CharSequence;)V

    return-void

    :cond_1
    iget-object v0, p0, LE3;->B:Landroid/widget/TextView;

    if-eqz v0, :cond_2

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_2
    return-void
.end method

.method public final l(LH0;)LI0;
    .locals 8

    if-eqz p1, :cond_12

    iget-object v0, p0, LE3;->u:LI0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LI0;->a()V

    :cond_0
    new-instance v0, LP3;

    invoke-direct {v0, p0, p1}, LP3;-><init>(LE3;LH0;)V

    invoke-virtual {p0}, LE3;->A()V

    iget-object p1, p0, LE3;->o:Ln0;

    iget-object v1, p0, LE3;->n:Ljava/lang/Object;

    if-eqz p1, :cond_1

    invoke-virtual {p1, v0}, Ln0;->p(LP3;)LI0;

    move-result-object p1

    iput-object p1, p0, LE3;->u:LI0;

    if-eqz p1, :cond_1

    invoke-interface {v1, p1}, Lg3;->onSupportActionModeStarted(LI0;)V

    :cond_1
    iget-object p1, p0, LE3;->u:LI0;

    if-nez p1, :cond_11

    iget-object p1, p0, LE3;->y:LGE;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, LGE;->b()V

    :cond_2
    iget-object p1, p0, LE3;->u:LI0;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, LI0;->a()V

    :cond_3
    iget-boolean p1, p0, LE3;->Q:Z

    const/4 v2, 0x0

    if-nez p1, :cond_4

    :try_start_0
    invoke-interface {v1, v0}, Lg3;->onWindowStartingSupportActionMode(LH0;)LI0;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :cond_4
    move-object p1, v2

    :goto_0
    if-eqz p1, :cond_5

    iput-object p1, p0, LE3;->u:LI0;

    goto/16 :goto_5

    :cond_5
    iget-object p1, p0, LE3;->v:Landroidx/appcompat/widget/ActionBarContextView;

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-nez p1, :cond_a

    iget-boolean p1, p0, LE3;->I:Z

    iget-object v5, p0, LE3;->k:Landroid/content/Context;

    if-eqz p1, :cond_7

    new-instance p1, Landroid/util/TypedValue;

    invoke-direct {p1}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {v5}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v6

    const v7, 0x5504000b

    invoke-virtual {v6, v7, p1, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget v7, p1, Landroid/util/TypedValue;->resourceId:I

    if-eqz v7, :cond_6

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    invoke-virtual {v7}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    move-result-object v7

    invoke-virtual {v7, v6}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    iget v6, p1, Landroid/util/TypedValue;->resourceId:I

    invoke-virtual {v7, v6, v3}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    new-instance v6, LDb;

    invoke-direct {v6, v5, v4}, LDb;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v6}, LDb;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v5

    invoke-virtual {v5, v7}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    move-object v5, v6

    :cond_6
    new-instance v6, Landroidx/appcompat/widget/ActionBarContextView;

    invoke-direct {v6, v5, v2}, Landroidx/appcompat/widget/ActionBarContextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    iput-object v6, p0, LE3;->v:Landroidx/appcompat/widget/ActionBarContextView;

    new-instance v6, Landroid/widget/PopupWindow;

    const v7, 0x5504001a

    invoke-direct {v6, v5, v2, v7}, Landroid/widget/PopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    iput-object v6, p0, LE3;->w:Landroid/widget/PopupWindow;

    const/4 v7, 0x2

    invoke-virtual {v6, v7}, Landroid/widget/PopupWindow;->setWindowLayoutType(I)V

    iget-object v6, p0, LE3;->w:Landroid/widget/PopupWindow;

    iget-object v7, p0, LE3;->v:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v6, v7}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    iget-object v6, p0, LE3;->w:Landroid/widget/PopupWindow;

    const/4 v7, -0x1

    invoke-virtual {v6, v7}, Landroid/widget/PopupWindow;->setWidth(I)V

    invoke-virtual {v5}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v6

    const v7, 0x55040005

    invoke-virtual {v6, v7, p1, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget p1, p1, Landroid/util/TypedValue;->data:I

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v5

    invoke-static {p1, v5}, Landroid/util/TypedValue;->complexToDimensionPixelSize(ILandroid/util/DisplayMetrics;)I

    move-result p1

    iget-object v5, p0, LE3;->v:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v5, p1}, Landroidx/appcompat/widget/ActionBarContextView;->setContentHeight(I)V

    iget-object p1, p0, LE3;->w:Landroid/widget/PopupWindow;

    const/4 v5, -0x2

    invoke-virtual {p1, v5}, Landroid/widget/PopupWindow;->setHeight(I)V

    new-instance p1, Lr3;

    invoke-direct {p1, p0, v3}, Lr3;-><init>(LE3;I)V

    iput-object p1, p0, LE3;->x:Lr3;

    goto :goto_3

    :cond_7
    iget-object p1, p0, LE3;->A:Landroid/view/ViewGroup;

    const v6, 0x550a0043

    invoke-virtual {p1, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroidx/appcompat/widget/ViewStubCompat;

    if-eqz p1, :cond_a

    invoke-virtual {p0}, LE3;->A()V

    iget-object v6, p0, LE3;->o:Ln0;

    if-eqz v6, :cond_8

    invoke-virtual {v6}, Ln0;->e()Landroid/content/Context;

    move-result-object v6

    goto :goto_1

    :cond_8
    move-object v6, v2

    :goto_1
    if-nez v6, :cond_9

    goto :goto_2

    :cond_9
    move-object v5, v6

    :goto_2
    invoke-static {v5}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v5

    invoke-virtual {p1, v5}, Landroidx/appcompat/widget/ViewStubCompat;->setLayoutInflater(Landroid/view/LayoutInflater;)V

    invoke-virtual {p1}, Landroidx/appcompat/widget/ViewStubCompat;->a()Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroidx/appcompat/widget/ActionBarContextView;

    iput-object p1, p0, LE3;->v:Landroidx/appcompat/widget/ActionBarContextView;

    :cond_a
    :goto_3
    iget-object p1, p0, LE3;->v:Landroidx/appcompat/widget/ActionBarContextView;

    if-eqz p1, :cond_f

    iget-object p1, p0, LE3;->y:LGE;

    if-eqz p1, :cond_b

    invoke-virtual {p1}, LGE;->b()V

    :cond_b
    iget-object p1, p0, LE3;->v:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1}, Landroidx/appcompat/widget/ActionBarContextView;->e()V

    new-instance p1, LUy;

    iget-object v5, p0, LE3;->v:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    iget-object v6, p0, LE3;->v:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object v5, p1, LUy;->c:Landroid/content/Context;

    iput-object v6, p1, LUy;->d:Landroidx/appcompat/widget/ActionBarContextView;

    iput-object v0, p1, LUy;->e:LP3;

    new-instance v5, Llr;

    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-direct {v5, v6}, Llr;-><init>(Landroid/content/Context;)V

    iput v3, v5, Llr;->l:I

    iput-object v5, p1, LUy;->h:Llr;

    iput-object p1, v5, Llr;->e:Ljr;

    iget-object v0, v0, LP3;->b:Ljava/lang/Object;

    check-cast v0, LH0;

    invoke-interface {v0, p1, v5}, LH0;->b(LI0;Landroid/view/Menu;)Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-virtual {p1}, LUy;->h()V

    iget-object v0, p0, LE3;->v:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ActionBarContextView;->c(LI0;)V

    iput-object p1, p0, LE3;->u:LI0;

    iget-boolean p1, p0, LE3;->z:Z

    const/high16 v0, 0x3f800000    # 1.0f

    if-eqz p1, :cond_c

    iget-object p1, p0, LE3;->A:Landroid/view/ViewGroup;

    if-eqz p1, :cond_c

    invoke-virtual {p1}, Landroid/view/View;->isLaidOut()Z

    move-result p1

    if-eqz p1, :cond_c

    iget-object p1, p0, LE3;->v:Landroidx/appcompat/widget/ActionBarContextView;

    const/4 v2, 0x0

    invoke-virtual {p1, v2}, Landroid/view/View;->setAlpha(F)V

    iget-object p1, p0, LE3;->v:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-static {p1}, LlE;->a(Landroid/view/View;)LGE;

    move-result-object p1

    invoke-virtual {p1, v0}, LGE;->a(F)V

    iput-object p1, p0, LE3;->y:LGE;

    new-instance v0, Lt3;

    invoke-direct {v0, v3, p0}, Lt3;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p1, v0}, LGE;->d(LIE;)V

    goto :goto_4

    :cond_c
    iget-object p1, p0, LE3;->v:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    iget-object p1, p0, LE3;->v:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1, v4}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V

    iget-object p1, p0, LE3;->v:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    instance-of p1, p1, Landroid/view/View;

    if-eqz p1, :cond_d

    iget-object p1, p0, LE3;->v:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    sget-object v0, LlE;->a:Ljava/util/WeakHashMap;

    invoke-static {p1}, LcE;->c(Landroid/view/View;)V

    :cond_d
    :goto_4
    iget-object p1, p0, LE3;->w:Landroid/widget/PopupWindow;

    if-eqz p1, :cond_f

    iget-object p1, p0, LE3;->l:Landroid/view/Window;

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    iget-object v0, p0, LE3;->x:Lr3;

    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    goto :goto_5

    :cond_e
    iput-object v2, p0, LE3;->u:LI0;

    :cond_f
    :goto_5
    iget-object p1, p0, LE3;->u:LI0;

    if-eqz p1, :cond_10

    invoke-interface {v1, p1}, Lg3;->onSupportActionModeStarted(LI0;)V

    :cond_10
    invoke-virtual {p0}, LE3;->I()V

    iget-object p1, p0, LE3;->u:LI0;

    iput-object p1, p0, LE3;->u:LI0;

    :cond_11
    invoke-virtual {p0}, LE3;->I()V

    iget-object p1, p0, LE3;->u:LI0;

    return-object p1

    :cond_12
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "ActionMode callback can not be null."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final m(ZZ)Z
    .locals 16

    move-object/from16 v0, p0

    iget-boolean v1, v0, LE3;->Q:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    return v2

    :cond_0
    const/16 v1, -0x64

    iget v3, v0, LE3;->S:I

    if-eq v3, v1, :cond_1

    goto :goto_0

    :cond_1
    sget v3, Lq3;->b:I

    :goto_0
    iget-object v1, v0, LE3;->k:Landroid/content/Context;

    invoke-virtual {v0, v1, v3}, LE3;->C(Landroid/content/Context;I)I

    move-result v4

    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v6, 0x21

    const/4 v7, 0x0

    if-ge v5, v6, :cond_2

    invoke-static {v1}, LE3;->p(Landroid/content/Context;)LZo;

    move-result-object v6

    goto :goto_1

    :cond_2
    move-object v6, v7

    :goto_1
    if-nez p2, :cond_3

    if-eqz v6, :cond_3

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v6

    invoke-static {v6}, Lv3;->b(Landroid/content/res/Configuration;)LZo;

    move-result-object v6

    :cond_3
    invoke-static {v1, v4, v6, v7, v2}, LE3;->t(Landroid/content/Context;ILZo;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    move-result-object v8

    iget-boolean v9, v0, LE3;->V:Z

    const/4 v10, 0x1

    iget-object v11, v0, LE3;->j:Ljava/lang/Object;

    if-nez v9, :cond_6

    instance-of v9, v11, Landroid/app/Activity;

    if-eqz v9, :cond_6

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v9

    if-nez v9, :cond_4

    move v5, v2

    goto :goto_4

    :cond_4
    const/16 v12, 0x1d

    if-lt v5, v12, :cond_5

    const/high16 v5, 0x100c0000

    goto :goto_2

    :cond_5
    const/high16 v5, 0xc0000

    :goto_2
    :try_start_0
    new-instance v12, Landroid/content/ComponentName;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v13

    invoke-direct {v12, v1, v13}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v9, v12, v5}, Landroid/content/pm/PackageManager;->getActivityInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;

    move-result-object v5

    if-eqz v5, :cond_6

    iget v5, v5, Landroid/content/pm/ActivityInfo;->configChanges:I

    iput v5, v0, LE3;->U:I
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    iput v2, v0, LE3;->U:I

    :cond_6
    :goto_3
    iput-boolean v10, v0, LE3;->V:Z

    iget v5, v0, LE3;->U:I

    :goto_4
    iget-object v9, v0, LE3;->R:Landroid/content/res/Configuration;

    if-nez v9, :cond_7

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v9

    invoke-virtual {v9}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v9

    :cond_7
    iget v12, v9, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v12, v12, 0x30

    iget v13, v8, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v13, v13, 0x30

    invoke-static {v9}, Lv3;->b(Landroid/content/res/Configuration;)LZo;

    move-result-object v9

    if-nez v6, :cond_8

    move-object v14, v7

    goto :goto_5

    :cond_8
    invoke-static {v8}, Lv3;->b(Landroid/content/res/Configuration;)LZo;

    move-result-object v14

    :goto_5
    if-eq v12, v13, :cond_9

    const/16 v12, 0x200

    goto :goto_6

    :cond_9
    move v12, v2

    :goto_6
    if-eqz v14, :cond_a

    invoke-virtual {v9, v14}, LZo;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_a

    or-int/lit16 v12, v12, 0x2004

    :cond_a
    not-int v9, v5

    and-int/2addr v9, v12

    if-eqz v9, :cond_d

    if-eqz p1, :cond_d

    iget-boolean v9, v0, LE3;->O:Z

    if-eqz v9, :cond_d

    sget-boolean v9, LE3;->j0:Z

    if-nez v9, :cond_b

    iget-boolean v9, v0, LE3;->P:Z

    if-eqz v9, :cond_d

    :cond_b
    instance-of v9, v11, Landroid/app/Activity;

    if-eqz v9, :cond_d

    move-object v9, v11

    check-cast v9, Landroid/app/Activity;

    invoke-virtual {v9}, Landroid/app/Activity;->isChild()Z

    move-result v15

    if-nez v15, :cond_d

    sget v15, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1f

    if-lt v15, v2, :cond_c

    and-int/lit16 v2, v12, 0x2000

    if-eqz v2, :cond_c

    invoke-virtual {v9}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v8}, Landroid/content/res/Configuration;->getLayoutDirection()I

    move-result v8

    invoke-virtual {v2, v8}, Landroid/view/View;->setLayoutDirection(I)V

    :cond_c
    invoke-virtual {v9}, Landroid/app/Activity;->recreate()V

    move v2, v10

    goto :goto_7

    :cond_d
    const/4 v2, 0x0

    :goto_7
    if-nez v2, :cond_12

    if-eqz v12, :cond_12

    and-int v2, v12, v5

    if-ne v2, v12, :cond_e

    move v2, v10

    goto :goto_8

    :cond_e
    const/4 v2, 0x0

    :goto_8
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    new-instance v8, Landroid/content/res/Configuration;

    invoke-virtual {v5}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v9

    invoke-direct {v8, v9}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    invoke-virtual {v5}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v9

    iget v9, v9, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v9, v9, -0x31

    or-int/2addr v9, v13

    iput v9, v8, Landroid/content/res/Configuration;->uiMode:I

    if-eqz v14, :cond_f

    invoke-static {v8, v14}, Lv3;->d(Landroid/content/res/Configuration;LZo;)V

    :cond_f
    invoke-virtual {v5, v8, v7}, Landroid/content/res/Resources;->updateConfiguration(Landroid/content/res/Configuration;Landroid/util/DisplayMetrics;)V

    iget v5, v0, LE3;->T:I

    if-eqz v5, :cond_10

    invoke-virtual {v1, v5}, Landroid/content/Context;->setTheme(I)V

    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v5

    iget v7, v0, LE3;->T:I

    invoke-virtual {v5, v7, v10}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    :cond_10
    if-eqz v2, :cond_13

    instance-of v2, v11, Landroid/app/Activity;

    if-eqz v2, :cond_13

    move-object v2, v11

    check-cast v2, Landroid/app/Activity;

    instance-of v5, v2, LYn;

    if-eqz v5, :cond_11

    move-object v5, v2

    check-cast v5, LYn;

    invoke-interface {v5}, LYn;->getLifecycle()LRn;

    move-result-object v5

    check-cast v5, Lao;

    iget-object v5, v5, Lao;->c:LPn;

    sget-object v7, LPn;->c:LPn;

    invoke-virtual {v5, v7}, LPn;->a(LPn;)Z

    move-result v5

    if-eqz v5, :cond_13

    invoke-virtual {v2, v8}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    goto :goto_9

    :cond_11
    iget-boolean v5, v0, LE3;->P:Z

    if-eqz v5, :cond_13

    iget-boolean v5, v0, LE3;->Q:Z

    if-nez v5, :cond_13

    invoke-virtual {v2, v8}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    goto :goto_9

    :cond_12
    move v10, v2

    :cond_13
    :goto_9
    if-eqz v10, :cond_15

    instance-of v2, v11, Lc3;

    if-eqz v2, :cond_15

    and-int/lit16 v2, v12, 0x200

    if-eqz v2, :cond_14

    move-object v2, v11

    check-cast v2, Lc3;

    invoke-virtual {v2, v4}, Lc3;->onNightModeChanged(I)V

    :cond_14
    and-int/lit8 v2, v12, 0x4

    if-eqz v2, :cond_15

    check-cast v11, Lc3;

    invoke-virtual {v11, v6}, Lc3;->onLocalesChanged(LZo;)V

    :cond_15
    if-eqz v14, :cond_16

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v2

    invoke-static {v2}, Lv3;->b(Landroid/content/res/Configuration;)LZo;

    move-result-object v2

    invoke-static {v2}, Lv3;->c(LZo;)V

    :cond_16
    if-nez v3, :cond_17

    invoke-virtual {v0, v1}, LE3;->y(Landroid/content/Context;)LB3;

    move-result-object v2

    invoke-virtual {v2}, LB3;->n()V

    goto :goto_a

    :cond_17
    iget-object v2, v0, LE3;->W:Lz3;

    if-eqz v2, :cond_18

    invoke-virtual {v2}, LB3;->c()V

    :cond_18
    :goto_a
    const/4 v2, 0x3

    if-ne v3, v2, :cond_1a

    iget-object v2, v0, LE3;->X:Lz3;

    if-nez v2, :cond_19

    new-instance v2, Lz3;

    invoke-direct {v2, v0, v1}, Lz3;-><init>(LE3;Landroid/content/Context;)V

    iput-object v2, v0, LE3;->X:Lz3;

    :cond_19
    iget-object v1, v0, LE3;->X:Lz3;

    invoke-virtual {v1}, LB3;->n()V

    goto :goto_b

    :cond_1a
    iget-object v1, v0, LE3;->X:Lz3;

    if-eqz v1, :cond_1b

    invoke-virtual {v1}, LB3;->c()V

    :cond_1b
    :goto_b
    return v10
.end method

.method public final n(Llr;)V
    .locals 5

    iget-object p1, p0, LE3;->r:LKc;

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_5

    check-cast p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k()V

    iget-object p1, p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;->e:LLc;

    check-cast p1, LwB;

    iget-object p1, p1, LwB;->a:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result v2

    if-nez v2, :cond_5

    iget-object p1, p1, Landroidx/appcompat/widget/Toolbar;->a:Landroidx/appcompat/widget/ActionMenuView;

    if-eqz p1, :cond_5

    iget-boolean p1, p1, Landroidx/appcompat/widget/ActionMenuView;->s:Z

    if-eqz p1, :cond_5

    iget-object p1, p0, LE3;->k:Landroid/content/Context;

    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->hasPermanentMenuKey()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LE3;->r:LKc;

    check-cast p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k()V

    iget-object p1, p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;->e:LLc;

    check-cast p1, LwB;

    iget-object p1, p1, LwB;->a:Landroidx/appcompat/widget/Toolbar;

    iget-object p1, p1, Landroidx/appcompat/widget/Toolbar;->a:Landroidx/appcompat/widget/ActionMenuView;

    if-eqz p1, :cond_5

    iget-object p1, p1, Landroidx/appcompat/widget/ActionMenuView;->t:LD0;

    if-eqz p1, :cond_5

    iget-object v2, p1, LD0;->u:LB0;

    if-nez v2, :cond_0

    invoke-virtual {p1}, LD0;->h()Z

    move-result p1

    if-eqz p1, :cond_5

    :cond_0
    iget-object p1, p0, LE3;->l:Landroid/view/Window;

    invoke-virtual {p1}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object p1

    iget-object v2, p0, LE3;->r:LKc;

    check-cast v2, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {v2}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k()V

    iget-object v2, v2, Landroidx/appcompat/widget/ActionBarOverlayLayout;->e:LLc;

    check-cast v2, LwB;

    iget-object v2, v2, LwB;->a:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v2}, Landroidx/appcompat/widget/Toolbar;->o()Z

    move-result v2

    const/16 v3, 0x6c

    if-eqz v2, :cond_2

    iget-object v0, p0, LE3;->r:LKc;

    check-cast v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k()V

    iget-object v0, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->e:LLc;

    check-cast v0, LwB;

    iget-object v0, v0, LwB;->a:Landroidx/appcompat/widget/Toolbar;

    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->a:Landroidx/appcompat/widget/ActionMenuView;

    if-eqz v0, :cond_1

    iget-object v0, v0, Landroidx/appcompat/widget/ActionMenuView;->t:LD0;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LD0;->c()Z

    move-result v0

    :cond_1
    iget-boolean v0, p0, LE3;->Q:Z

    if-nez v0, :cond_4

    invoke-virtual {p0, v1}, LE3;->z(I)LD3;

    move-result-object v0

    iget-object v0, v0, LD3;->h:Llr;

    invoke-interface {p1, v3, v0}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    return-void

    :cond_2
    if-eqz p1, :cond_4

    iget-boolean v2, p0, LE3;->Q:Z

    if-nez v2, :cond_4

    iget-boolean v2, p0, LE3;->Y:Z

    if-eqz v2, :cond_3

    iget v2, p0, LE3;->Z:I

    and-int/2addr v0, v2

    if-eqz v0, :cond_3

    iget-object v0, p0, LE3;->l:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    iget-object v2, p0, LE3;->a0:Lr3;

    invoke-virtual {v0, v2}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    invoke-virtual {v2}, Lr3;->run()V

    :cond_3
    invoke-virtual {p0, v1}, LE3;->z(I)LD3;

    move-result-object v0

    iget-object v2, v0, LD3;->h:Llr;

    if-eqz v2, :cond_4

    iget-boolean v4, v0, LD3;->o:Z

    if-nez v4, :cond_4

    iget-object v4, v0, LD3;->g:Landroid/view/View;

    invoke-interface {p1, v1, v4, v2}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v0, v0, LD3;->h:Llr;

    invoke-interface {p1, v3, v0}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    iget-object p1, p0, LE3;->r:LKc;

    check-cast p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k()V

    iget-object p1, p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;->e:LLc;

    check-cast p1, LwB;

    iget-object p1, p1, LwB;->a:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->u()Z

    :cond_4
    return-void

    :cond_5
    invoke-virtual {p0, v1}, LE3;->z(I)LD3;

    move-result-object p1

    iput-boolean v0, p1, LD3;->n:Z

    invoke-virtual {p0, p1, v1}, LE3;->s(LD3;Z)V

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, LE3;->E(LD3;Landroid/view/KeyEvent;)V

    return-void
.end method

.method public final o(Landroid/view/Window;)V
    .locals 7

    const-string v0, "AppCompat has already installed itself into the Window"

    iget-object v1, p0, LE3;->l:Landroid/view/Window;

    if-nez v1, :cond_6

    invoke-virtual {p1}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v1

    instance-of v2, v1, Ly3;

    if-nez v2, :cond_5

    new-instance v0, Ly3;

    invoke-direct {v0, p0, v1}, Ly3;-><init>(LE3;Landroid/view/Window$Callback;)V

    iput-object v0, p0, LE3;->m:Ly3;

    invoke-virtual {p1, v0}, Landroid/view/Window;->setCallback(Landroid/view/Window$Callback;)V

    iget-object v0, p0, LE3;->k:Landroid/content/Context;

    sget-object v1, LE3;->i0:[I

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v1

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v1, v3, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {}, LG3;->a()LG3;

    move-result-object v4

    monitor-enter v4

    :try_start_0
    iget-object v5, v4, LG3;->a:Lyw;

    const/4 v6, 0x1

    invoke-virtual {v5, v0, v3, v6}, Lyw;->d(Landroid/content/Context;IZ)Landroid/graphics/drawable/Drawable;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {p1, v0}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_1
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    iput-object p1, p0, LE3;->l:Landroid/view/Window;

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x21

    if-lt p1, v0, :cond_4

    iget-object p1, p0, LE3;->f0:Landroid/window/OnBackInvokedDispatcher;

    if-nez p1, :cond_4

    iget-object v0, p0, LE3;->j:Ljava/lang/Object;

    if-eqz p1, :cond_2

    iget-object v1, p0, LE3;->g0:Landroid/window/OnBackInvokedCallback;

    if-eqz v1, :cond_2

    invoke-static {p1, v1}, Lx3;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v2, p0, LE3;->g0:Landroid/window/OnBackInvokedCallback;

    :cond_2
    instance-of p1, v0, Landroid/app/Activity;

    if-eqz p1, :cond_3

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-static {v0}, Lx3;->a(Landroid/app/Activity;)Landroid/window/OnBackInvokedDispatcher;

    move-result-object p1

    iput-object p1, p0, LE3;->f0:Landroid/window/OnBackInvokedDispatcher;

    goto :goto_1

    :cond_3
    iput-object v2, p0, LE3;->f0:Landroid/window/OnBackInvokedDispatcher;

    :goto_1
    invoke-virtual {p0}, LE3;->I()V

    :cond_4
    return-void

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 8

    .line 1
    iget-object p1, p0, LE3;->e0:Lv4;

    const/4 v1, 0x0

    if-nez p1, :cond_1

    .line 2
    sget-object p1, LWu;->j:[I

    iget-object v0, p0, LE3;->k:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object p1

    const/16 v2, 0x74

    .line 3
    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 4
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    if-nez v2, :cond_0

    .line 5
    new-instance p1, Lv4;

    invoke-direct {p1}, Lv4;-><init>()V

    iput-object p1, p0, LE3;->e0:Lv4;

    goto :goto_0

    .line 6
    :cond_0
    :try_start_0
    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p1

    invoke-virtual {p1, v2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1

    .line 7
    invoke-virtual {p1, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p1

    .line 8
    invoke-virtual {p1, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lv4;

    iput-object p1, p0, LE3;->e0:Lv4;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 9
    :catchall_0
    new-instance p1, Lv4;

    invoke-direct {p1}, Lv4;-><init>()V

    iput-object p1, p0, LE3;->e0:Lv4;

    .line 10
    :cond_1
    :goto_0
    iget-object p1, p0, LE3;->e0:Lv4;

    .line 11
    sget v0, LND;->a:I

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    sget-object v0, LWu;->y:[I

    const/4 v5, 0x0

    invoke-virtual {p3, p4, v0, v5, v5}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v0

    const/4 v2, 0x4

    .line 14
    invoke-virtual {v0, v2, v5}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    .line 15
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    if-eqz v3, :cond_3

    .line 16
    instance-of v0, p3, LDb;

    if-eqz v0, :cond_2

    move-object v0, p3

    check-cast v0, LDb;

    .line 17
    iget v0, v0, LDb;->a:I

    if-eq v0, v3, :cond_3

    .line 18
    :cond_2
    new-instance v0, LDb;

    invoke-direct {v0, p3, v3}, LDb;-><init>(Landroid/content/Context;I)V

    goto :goto_1

    :cond_3
    move-object v0, p3

    .line 19
    :goto_1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result v3

    const/4 v4, 0x3

    const/4 v6, 0x1

    const/4 v7, -0x1

    sparse-switch v3, :sswitch_data_0

    :goto_2
    move v2, v7

    goto/16 :goto_3

    :sswitch_0
    const-string v2, "Button"

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_2

    :cond_4
    const/16 v2, 0xd

    goto/16 :goto_3

    :sswitch_1
    const-string v2, "EditText"

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    goto :goto_2

    :cond_5
    const/16 v2, 0xc

    goto/16 :goto_3

    :sswitch_2
    const-string v2, "CheckBox"

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    goto :goto_2

    :cond_6
    const/16 v2, 0xb

    goto/16 :goto_3

    :sswitch_3
    const-string v2, "AutoCompleteTextView"

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    goto :goto_2

    :cond_7
    const/16 v2, 0xa

    goto/16 :goto_3

    :sswitch_4
    const-string v2, "ImageView"

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    goto :goto_2

    :cond_8
    const/16 v2, 0x9

    goto/16 :goto_3

    :sswitch_5
    const-string v2, "ToggleButton"

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    goto :goto_2

    :cond_9
    const/16 v2, 0x8

    goto/16 :goto_3

    :sswitch_6
    const-string v2, "RadioButton"

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_a

    goto :goto_2

    :cond_a
    const/4 v2, 0x7

    goto :goto_3

    :sswitch_7
    const-string v2, "Spinner"

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_b

    goto :goto_2

    :cond_b
    const/4 v2, 0x6

    goto :goto_3

    :sswitch_8
    const-string v2, "SeekBar"

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_c

    goto :goto_2

    :cond_c
    const/4 v2, 0x5

    goto :goto_3

    :sswitch_9
    const-string v3, "ImageButton"

    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_11

    goto :goto_2

    :sswitch_a
    const-string v2, "TextView"

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_d

    goto/16 :goto_2

    :cond_d
    move v2, v4

    goto :goto_3

    :sswitch_b
    const-string v2, "MultiAutoCompleteTextView"

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_e

    goto/16 :goto_2

    :cond_e
    const/4 v2, 0x2

    goto :goto_3

    :sswitch_c
    const-string v2, "CheckedTextView"

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_f

    goto/16 :goto_2

    :cond_f
    move v2, v6

    goto :goto_3

    :sswitch_d
    const-string v2, "RatingBar"

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_10

    goto/16 :goto_2

    :cond_10
    const/4 v2, 0x0

    :cond_11
    :goto_3
    packed-switch v2, :pswitch_data_0

    move-object v2, v1

    goto :goto_4

    .line 20
    :pswitch_0
    invoke-virtual {p1, v0, p4}, Lv4;->b(Landroid/content/Context;Landroid/util/AttributeSet;)Lf3;

    move-result-object v2

    goto :goto_4

    .line 21
    :pswitch_1
    new-instance v2, LI3;

    .line 22
    invoke-direct {v2, v0, p4}, LI3;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_4

    .line 23
    :pswitch_2
    invoke-virtual {p1, v0, p4}, Lv4;->c(Landroid/content/Context;Landroid/util/AttributeSet;)Lh3;

    move-result-object v2

    goto :goto_4

    .line 24
    :pswitch_3
    invoke-virtual {p1, v0, p4}, Lv4;->a(Landroid/content/Context;Landroid/util/AttributeSet;)Ld3;

    move-result-object v2

    goto :goto_4

    .line 25
    :pswitch_4
    new-instance v2, LM3;

    .line 26
    invoke-direct {v2, v0, p4, v5}, LM3;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    goto :goto_4

    .line 27
    :pswitch_5
    new-instance v2, Lt4;

    invoke-direct {v2, v0, p4}, Lt4;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_4

    .line 28
    :pswitch_6
    invoke-virtual {p1, v0, p4}, Lv4;->d(Landroid/content/Context;Landroid/util/AttributeSet;)LQ3;

    move-result-object v2

    goto :goto_4

    .line 29
    :pswitch_7
    new-instance v2, Lf4;

    invoke-direct {v2, v0, p4}, Lf4;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_4

    .line 30
    :pswitch_8
    new-instance v2, LT3;

    invoke-direct {v2, v0, p4}, LT3;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_4

    .line 31
    :pswitch_9
    new-instance v2, LK3;

    const v3, 0x55040298

    .line 32
    invoke-direct {v2, v0, p4, v3}, LK3;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    goto :goto_4

    .line 33
    :pswitch_a
    invoke-virtual {p1, v0, p4}, Lv4;->e(Landroid/content/Context;Landroid/util/AttributeSet;)Lo4;

    move-result-object v2

    goto :goto_4

    .line 34
    :pswitch_b
    new-instance v2, LN3;

    invoke-direct {v2, v0, p4}, LN3;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_4

    .line 35
    :pswitch_c
    new-instance v2, Li3;

    invoke-direct {v2, v0, p4}, Li3;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_4

    .line 36
    :pswitch_d
    new-instance v2, LR3;

    invoke-direct {v2, v0, p4}, LR3;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    :goto_4
    if-nez v2, :cond_16

    if-eq p3, v0, :cond_16

    .line 37
    iget-object p3, p1, Lv4;->a:[Ljava/lang/Object;

    const-string v2, "view"

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_12

    .line 38
    const-string p2, "class"

    invoke-interface {p4, v1, p2}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 39
    :cond_12
    :try_start_1
    aput-object v0, p3, v5

    .line 40
    aput-object p4, p3, v6

    const/16 v2, 0x2e

    .line 41
    invoke-virtual {p2, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    if-ne v7, v2, :cond_15

    move v2, v5

    .line 42
    :goto_5
    sget-object v3, Lv4;->g:[Ljava/lang/String;

    if-ge v2, v4, :cond_14

    .line 43
    aget-object v3, v3, v2

    invoke-virtual {p1, v0, p2, v3}, Lv4;->f(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;

    move-result-object v3
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v3, :cond_13

    .line 44
    aput-object v1, p3, v5

    .line 45
    aput-object v1, p3, v6

    move-object v1, v3

    goto :goto_7

    :cond_13
    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :catchall_1
    move-exception v0

    move-object p1, v0

    goto :goto_6

    .line 46
    :cond_14
    aput-object v1, p3, v5

    .line 47
    aput-object v1, p3, v6

    goto :goto_7

    .line 48
    :cond_15
    :try_start_2
    invoke-virtual {p1, v0, p2, v1}, Lv4;->f(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;

    move-result-object p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 49
    aput-object v1, p3, v5

    .line 50
    aput-object v1, p3, v6

    move-object v1, p1

    goto :goto_7

    .line 51
    :goto_6
    aput-object v1, p3, v5

    .line 52
    aput-object v1, p3, v6

    .line 53
    throw p1

    .line 54
    :catch_0
    aput-object v1, p3, v5

    .line 55
    aput-object v1, p3, v6

    goto :goto_7

    :cond_16
    move-object v1, v2

    :goto_7
    if-eqz v1, :cond_1e

    .line 56
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    .line 57
    instance-of p2, p1, Landroid/content/ContextWrapper;

    if-eqz p2, :cond_19

    invoke-virtual {v1}, Landroid/view/View;->hasOnClickListeners()Z

    move-result p2

    if-nez p2, :cond_17

    goto :goto_8

    .line 58
    :cond_17
    sget-object p2, Lv4;->c:[I

    invoke-virtual {p1, p4, p2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 59
    invoke-virtual {p1, v5}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_18

    .line 60
    new-instance p3, Lu4;

    invoke-direct {p3, v1, p2}, Lu4;-><init>(Landroid/view/View;Ljava/lang/String;)V

    invoke-virtual {v1, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 61
    :cond_18
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 62
    :cond_19
    :goto_8
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v6, 0x1c

    if-le p1, v6, :cond_1a

    goto :goto_9

    .line 63
    :cond_1a
    sget-object p1, Lv4;->d:[I

    invoke-virtual {v0, p4, p1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 64
    invoke-virtual {p1, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result p2

    const-class v4, Ljava/lang/Boolean;

    if-eqz p2, :cond_1b

    .line 65
    invoke-virtual {p1, v5, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    sget-object p3, LlE;->a:Ljava/util/WeakHashMap;

    .line 66
    new-instance v2, LaE;

    const v3, 0x550a0219

    const/4 v7, 0x3

    .line 67
    invoke-direct/range {v2 .. v7}, LaE;-><init>(ILjava/lang/Class;III)V

    .line 68
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {v2, v1, p2}, Lnq;->f(Landroid/view/View;Ljava/lang/Object;)V

    .line 69
    :cond_1b
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 70
    sget-object p1, Lv4;->e:[I

    invoke-virtual {v0, p4, p1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 71
    invoke-virtual {p1, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result p2

    if-eqz p2, :cond_1c

    .line 72
    invoke-virtual {p1, v5}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {v1, p2}, LlE;->m(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 73
    :cond_1c
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 74
    sget-object p1, Lv4;->f:[I

    invoke-virtual {v0, p4, p1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 75
    invoke-virtual {p1, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result p2

    if-eqz p2, :cond_1d

    .line 76
    invoke-virtual {p1, v5, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    .line 77
    sget-object p3, LlE;->a:Ljava/util/WeakHashMap;

    .line 78
    new-instance v2, LaE;

    const v3, 0x550a0224

    const/4 v7, 0x0

    .line 79
    invoke-direct/range {v2 .. v7}, LaE;-><init>(ILjava/lang/Class;III)V

    .line 80
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {v2, v1, p2}, Lnq;->f(Landroid/view/View;Ljava/lang/Object;)V

    .line 81
    :cond_1d
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    :cond_1e
    :goto_9
    return-object v1

    :sswitch_data_0
    .sparse-switch
        -0x7404ceea -> :sswitch_d
        -0x56c015e7 -> :sswitch_c
        -0x503aa7ad -> :sswitch_b
        -0x37f7066e -> :sswitch_a
        -0x37e04bb3 -> :sswitch_9
        -0x274065a5 -> :sswitch_8
        -0x1440b607 -> :sswitch_7
        0x2e46a6ed -> :sswitch_6
        0x2fa453c6 -> :sswitch_5
        0x431b5280 -> :sswitch_4
        0x5445f9ba -> :sswitch_3
        0x5f7507c3 -> :sswitch_2
        0x63577677 -> :sswitch_1
        0x77471352 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    const/4 v0, 0x0

    .line 82
    invoke-virtual {p0, v0, p1, p2, p3}, LE3;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public final q(ILD3;Llr;)V
    .locals 3

    if-nez p3, :cond_1

    if-nez p2, :cond_0

    if-ltz p1, :cond_0

    iget-object v0, p0, LE3;->L:[LD3;

    array-length v1, v0

    if-ge p1, v1, :cond_0

    aget-object p2, v0, p1

    :cond_0
    if-eqz p2, :cond_1

    iget-object p3, p2, LD3;->h:Llr;

    :cond_1
    if-eqz p2, :cond_2

    iget-boolean p2, p2, LD3;->m:Z

    if-nez p2, :cond_2

    goto :goto_0

    :cond_2
    iget-boolean p2, p0, LE3;->Q:Z

    if-nez p2, :cond_3

    iget-object p2, p0, LE3;->m:Ly3;

    iget-object v0, p0, LE3;->l:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v0

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x1

    const/4 v2, 0x0

    :try_start_0
    iput-boolean v1, p2, Ly3;->e:Z

    invoke-interface {v0, p1, p3}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean v2, p2, Ly3;->e:Z

    return-void

    :catchall_0
    move-exception p1

    iput-boolean v2, p2, Ly3;->e:Z

    throw p1

    :cond_3
    :goto_0
    return-void
.end method

.method public final r(Llr;)V
    .locals 2

    iget-boolean v0, p0, LE3;->K:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, LE3;->K:Z

    iget-object v0, p0, LE3;->r:LKc;

    check-cast v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k()V

    iget-object v0, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->e:LLc;

    check-cast v0, LwB;

    iget-object v0, v0, LwB;->a:Landroidx/appcompat/widget/Toolbar;

    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->a:Landroidx/appcompat/widget/ActionMenuView;

    if-eqz v0, :cond_1

    iget-object v0, v0, Landroidx/appcompat/widget/ActionMenuView;->t:LD0;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LD0;->c()Z

    iget-object v0, v0, LD0;->t:Lz0;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lxr;->b()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v0, v0, Lxr;->i:Lvr;

    invoke-interface {v0}, Lky;->dismiss()V

    :cond_1
    iget-object v0, p0, LE3;->l:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-boolean v1, p0, LE3;->Q:Z

    if-nez v1, :cond_2

    const/16 v1, 0x6c

    invoke-interface {v0, v1, p1}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    :cond_2
    const/4 p1, 0x0

    iput-boolean p1, p0, LE3;->K:Z

    return-void
.end method

.method public final s(LD3;Z)V
    .locals 3

    if-eqz p2, :cond_0

    iget v0, p1, LD3;->a:I

    if-nez v0, :cond_0

    iget-object v0, p0, LE3;->r:LKc;

    if-eqz v0, :cond_0

    check-cast v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k()V

    iget-object v0, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->e:LLc;

    check-cast v0, LwB;

    iget-object v0, v0, LwB;->a:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p1, LD3;->h:Llr;

    invoke-virtual {p0, p1}, LE3;->r(Llr;)V

    return-void

    :cond_0
    iget-object v0, p0, LE3;->k:Landroid/content/Context;

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-boolean v2, p1, LD3;->m:Z

    if-eqz v2, :cond_1

    iget-object v2, p1, LD3;->e:LC3;

    if-eqz v2, :cond_1

    invoke-interface {v0, v2}, Landroid/view/ViewManager;->removeView(Landroid/view/View;)V

    if-eqz p2, :cond_1

    iget p2, p1, LD3;->a:I

    invoke-virtual {p0, p2, p1, v1}, LE3;->q(ILD3;Llr;)V

    :cond_1
    const/4 p2, 0x0

    iput-boolean p2, p1, LD3;->k:Z

    iput-boolean p2, p1, LD3;->l:Z

    iput-boolean p2, p1, LD3;->m:Z

    iput-object v1, p1, LD3;->f:Landroid/view/View;

    const/4 p2, 0x1

    iput-boolean p2, p1, LD3;->n:Z

    iget-object p2, p0, LE3;->M:LD3;

    if-ne p2, p1, :cond_2

    iput-object v1, p0, LE3;->M:LD3;

    :cond_2
    iget p1, p1, LD3;->a:I

    if-nez p1, :cond_3

    invoke-virtual {p0}, LE3;->I()V

    :cond_3
    return-void
.end method

.method public final u(Landroid/view/KeyEvent;)Z
    .locals 6

    iget-object v0, p0, LE3;->j:Ljava/lang/Object;

    instance-of v1, v0, LWm;

    if-nez v1, :cond_0

    instance-of v0, v0, Lx2;

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, LE3;->l:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_1

    sget-object v0, LlE;->a:Ljava/util/WeakHashMap;

    :cond_1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/4 v1, 0x0

    const/16 v2, 0x52

    const/4 v3, 0x1

    if-ne v0, v2, :cond_2

    iget-object v0, p0, LE3;->m:Ly3;

    iget-object v4, p0, LE3;->l:Landroid/view/Window;

    invoke-virtual {v4}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v4

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_0
    iput-boolean v3, v0, Ly3;->d:Z

    invoke-interface {v4, p1}, Landroid/view/Window$Callback;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean v1, v0, Ly3;->d:Z

    if-eqz v4, :cond_2

    goto/16 :goto_5

    :catchall_0
    move-exception p1

    iput-boolean v1, v0, Ly3;->d:Z

    throw p1

    :cond_2
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v4

    const/4 v5, 0x4

    if-nez v4, :cond_6

    if-eq v0, v5, :cond_4

    if-eq v0, v2, :cond_3

    goto/16 :goto_6

    :cond_3
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getRepeatCount()I

    move-result v0

    if-nez v0, :cond_10

    invoke-virtual {p0, v1}, LE3;->z(I)LD3;

    move-result-object v0

    iget-boolean v1, v0, LD3;->m:Z

    if-nez v1, :cond_10

    invoke-virtual {p0, v0, p1}, LE3;->G(LD3;Landroid/view/KeyEvent;)Z

    return v3

    :cond_4
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getFlags()I

    move-result p1

    and-int/lit16 p1, p1, 0x80

    if-eqz p1, :cond_5

    goto :goto_0

    :cond_5
    move v3, v1

    :goto_0
    iput-boolean v3, p0, LE3;->N:Z

    return v1

    :cond_6
    if-eq v0, v5, :cond_f

    if-eq v0, v2, :cond_7

    goto/16 :goto_6

    :cond_7
    iget-object v0, p0, LE3;->u:LI0;

    if-eqz v0, :cond_8

    goto/16 :goto_5

    :cond_8
    invoke-virtual {p0, v1}, LE3;->z(I)LD3;

    move-result-object v0

    iget-object v2, p0, LE3;->r:LKc;

    iget-object v4, p0, LE3;->k:Landroid/content/Context;

    if-eqz v2, :cond_a

    check-cast v2, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {v2}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k()V

    iget-object v2, v2, Landroidx/appcompat/widget/ActionBarOverlayLayout;->e:LLc;

    check-cast v2, LwB;

    iget-object v2, v2, LwB;->a:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v5

    if-nez v5, :cond_a

    iget-object v2, v2, Landroidx/appcompat/widget/Toolbar;->a:Landroidx/appcompat/widget/ActionMenuView;

    if-eqz v2, :cond_a

    iget-boolean v2, v2, Landroidx/appcompat/widget/ActionMenuView;->s:Z

    if-eqz v2, :cond_a

    invoke-static {v4}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/ViewConfiguration;->hasPermanentMenuKey()Z

    move-result v2

    if-nez v2, :cond_a

    iget-object v2, p0, LE3;->r:LKc;

    check-cast v2, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {v2}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k()V

    iget-object v2, v2, Landroidx/appcompat/widget/ActionBarOverlayLayout;->e:LLc;

    check-cast v2, LwB;

    iget-object v2, v2, LwB;->a:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v2}, Landroidx/appcompat/widget/Toolbar;->o()Z

    move-result v2

    if-nez v2, :cond_9

    iget-boolean v2, p0, LE3;->Q:Z

    if-nez v2, :cond_d

    invoke-virtual {p0, v0, p1}, LE3;->G(LD3;Landroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_d

    iget-object p1, p0, LE3;->r:LKc;

    check-cast p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k()V

    iget-object p1, p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;->e:LLc;

    check-cast p1, LwB;

    iget-object p1, p1, LwB;->a:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->u()Z

    move-result p1

    goto :goto_4

    :cond_9
    iget-object p1, p0, LE3;->r:LKc;

    check-cast p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k()V

    iget-object p1, p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;->e:LLc;

    check-cast p1, LwB;

    iget-object p1, p1, LwB;->a:Landroidx/appcompat/widget/Toolbar;

    iget-object p1, p1, Landroidx/appcompat/widget/Toolbar;->a:Landroidx/appcompat/widget/ActionMenuView;

    if-eqz p1, :cond_d

    iget-object p1, p1, Landroidx/appcompat/widget/ActionMenuView;->t:LD0;

    if-eqz p1, :cond_d

    invoke-virtual {p1}, LD0;->c()Z

    move-result p1

    if-eqz p1, :cond_d

    goto :goto_2

    :cond_a
    iget-boolean v2, v0, LD3;->m:Z

    if-nez v2, :cond_e

    iget-boolean v5, v0, LD3;->l:Z

    if-eqz v5, :cond_b

    goto :goto_3

    :cond_b
    iget-boolean v2, v0, LD3;->k:Z

    if-eqz v2, :cond_d

    iget-boolean v2, v0, LD3;->o:Z

    if-eqz v2, :cond_c

    iput-boolean v1, v0, LD3;->k:Z

    invoke-virtual {p0, v0, p1}, LE3;->G(LD3;Landroid/view/KeyEvent;)Z

    move-result v2

    goto :goto_1

    :cond_c
    move v2, v3

    :goto_1
    if-eqz v2, :cond_d

    invoke-virtual {p0, v0, p1}, LE3;->E(LD3;Landroid/view/KeyEvent;)V

    :goto_2
    move p1, v3

    goto :goto_4

    :cond_d
    move p1, v1

    goto :goto_4

    :cond_e
    :goto_3
    invoke-virtual {p0, v0, v3}, LE3;->s(LD3;Z)V

    move p1, v2

    :goto_4
    if-eqz p1, :cond_10

    invoke-virtual {v4}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "audio"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/media/AudioManager;

    if-eqz p1, :cond_10

    invoke-virtual {p1, v1}, Landroid/media/AudioManager;->playSoundEffect(I)V

    return v3

    :cond_f
    invoke-virtual {p0}, LE3;->D()Z

    move-result p1

    if-eqz p1, :cond_11

    :cond_10
    :goto_5
    return v3

    :cond_11
    :goto_6
    return v1
.end method

.method public final v(I)V
    .locals 3

    invoke-virtual {p0, p1}, LE3;->z(I)LD3;

    move-result-object v0

    iget-object v1, v0, LD3;->h:Llr;

    if-eqz v1, :cond_1

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    iget-object v2, v0, LD3;->h:Llr;

    invoke-virtual {v2, v1}, Llr;->t(Landroid/os/Bundle;)V

    invoke-virtual {v1}, Landroid/os/BaseBundle;->size()I

    move-result v2

    if-lez v2, :cond_0

    iput-object v1, v0, LD3;->p:Landroid/os/Bundle;

    :cond_0
    iget-object v1, v0, LD3;->h:Llr;

    invoke-virtual {v1}, Llr;->w()V

    iget-object v1, v0, LD3;->h:Llr;

    invoke-virtual {v1}, Llr;->clear()V

    :cond_1
    const/4 v1, 0x1

    iput-boolean v1, v0, LD3;->o:Z

    iput-boolean v1, v0, LD3;->n:Z

    const/16 v0, 0x6c

    if-eq p1, v0, :cond_2

    if-nez p1, :cond_3

    :cond_2
    iget-object p1, p0, LE3;->r:LKc;

    if-eqz p1, :cond_3

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, LE3;->z(I)LD3;

    move-result-object v0

    iput-boolean p1, v0, LD3;->k:Z

    const/4 p1, 0x0

    invoke-virtual {p0, v0, p1}, LE3;->G(LD3;Landroid/view/KeyEvent;)Z

    :cond_3
    return-void
.end method

.method public final w()V
    .locals 11

    iget-boolean v0, p0, LE3;->z:Z

    if-nez v0, :cond_1b

    iget-object v0, p0, LE3;->k:Landroid/content/Context;

    sget-object v1, LWu;->j:[I

    invoke-virtual {v0, v1}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v2

    const/16 v3, 0x75

    invoke-virtual {v2, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v4

    if-eqz v4, :cond_1a

    const/16 v4, 0x7e

    const/4 v5, 0x0

    invoke-virtual {v2, v4, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v4

    const/16 v6, 0x6c

    const/4 v7, 0x1

    if-eqz v4, :cond_0

    invoke-virtual {p0, v7}, LE3;->g(I)Z

    goto :goto_0

    :cond_0
    invoke-virtual {v2, v3, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {p0, v6}, LE3;->g(I)Z

    :cond_1
    :goto_0
    const/16 v3, 0x76

    invoke-virtual {v2, v3, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v3

    const/16 v4, 0x6d

    if-eqz v3, :cond_2

    invoke-virtual {p0, v4}, LE3;->g(I)Z

    :cond_2
    const/16 v3, 0x77

    invoke-virtual {v2, v3, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v3

    if-eqz v3, :cond_3

    const/16 v3, 0xa

    invoke-virtual {p0, v3}, LE3;->g(I)Z

    :cond_3
    invoke-virtual {v2, v5, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v3

    iput-boolean v3, p0, LE3;->I:Z

    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    invoke-virtual {p0}, LE3;->x()V

    iget-object v2, p0, LE3;->l:Landroid/view/Window;

    invoke-virtual {v2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    iget-boolean v3, p0, LE3;->J:Z

    const/4 v8, 0x0

    if-nez v3, :cond_9

    iget-boolean v3, p0, LE3;->I:Z

    if-eqz v3, :cond_4

    const v3, 0x550d000c

    invoke-virtual {v2, v3, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup;

    iput-boolean v5, p0, LE3;->G:Z

    iput-boolean v5, p0, LE3;->F:Z

    goto/16 :goto_2

    :cond_4
    iget-boolean v2, p0, LE3;->F:Z

    if-eqz v2, :cond_8

    new-instance v2, Landroid/util/TypedValue;

    invoke-direct {v2}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v3

    const v9, 0x5504000b

    invoke-virtual {v3, v9, v2, v7}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget v3, v2, Landroid/util/TypedValue;->resourceId:I

    if-eqz v3, :cond_5

    new-instance v3, LDb;

    iget v2, v2, Landroid/util/TypedValue;->resourceId:I

    invoke-direct {v3, v0, v2}, LDb;-><init>(Landroid/content/Context;I)V

    goto :goto_1

    :cond_5
    move-object v3, v0

    :goto_1
    invoke-static {v3}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    const v3, 0x550d0017

    invoke-virtual {v2, v3, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup;

    const v3, 0x550a009a

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, LKc;

    iput-object v3, p0, LE3;->r:LKc;

    iget-object v9, p0, LE3;->l:Landroid/view/Window;

    invoke-virtual {v9}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v9

    invoke-interface {v3, v9}, LKc;->setWindowCallback(Landroid/view/Window$Callback;)V

    iget-boolean v3, p0, LE3;->G:Z

    if-eqz v3, :cond_6

    iget-object v3, p0, LE3;->r:LKc;

    check-cast v3, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {v3, v4}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->j(I)V

    :cond_6
    iget-boolean v3, p0, LE3;->D:Z

    if-eqz v3, :cond_7

    iget-object v3, p0, LE3;->r:LKc;

    const/4 v4, 0x2

    check-cast v3, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {v3, v4}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->j(I)V

    :cond_7
    iget-boolean v3, p0, LE3;->E:Z

    if-eqz v3, :cond_b

    iget-object v3, p0, LE3;->r:LKc;

    const/4 v4, 0x5

    check-cast v3, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {v3, v4}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->j(I)V

    goto :goto_2

    :cond_8
    move-object v2, v8

    goto :goto_2

    :cond_9
    iget-boolean v3, p0, LE3;->H:Z

    if-eqz v3, :cond_a

    const v3, 0x550d0016

    invoke-virtual {v2, v3, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup;

    goto :goto_2

    :cond_a
    const v3, 0x550d0015

    invoke-virtual {v2, v3, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup;

    :cond_b
    :goto_2
    if-eqz v2, :cond_19

    new-instance v3, Ls3;

    invoke-direct {v3, p0, v5}, Ls3;-><init>(LE3;I)V

    sget-object v4, LlE;->a:Ljava/util/WeakHashMap;

    invoke-static {v2, v3}, LeE;->l(Landroid/view/View;Lgt;)V

    iget-object v3, p0, LE3;->r:LKc;

    if-nez v3, :cond_c

    const v3, 0x550a0241

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    iput-object v3, p0, LE3;->B:Landroid/widget/TextView;

    :cond_c
    :try_start_0
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    const-string v4, "makeOptionalFitsSystemWindows"

    invoke-virtual {v3, v4, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/reflect/AccessibleObject;->isAccessible()Z

    move-result v4

    if-nez v4, :cond_d

    invoke-virtual {v3, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    :cond_d
    invoke-virtual {v3, v2, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const v3, 0x550a0036

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroidx/appcompat/widget/ContentFrameLayout;

    iget-object v4, p0, LE3;->l:Landroid/view/Window;

    const v9, 0x1020002

    invoke-virtual {v4, v9}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/view/ViewGroup;

    if-eqz v4, :cond_f

    :goto_3
    invoke-virtual {v4}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v10

    if-lez v10, :cond_e

    invoke-virtual {v4, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v10

    invoke-virtual {v4, v5}, Landroid/view/ViewGroup;->removeViewAt(I)V

    invoke-virtual {v3, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    goto :goto_3

    :cond_e
    const/4 v10, -0x1

    invoke-virtual {v4, v10}, Landroid/view/View;->setId(I)V

    invoke-virtual {v3, v9}, Landroid/view/View;->setId(I)V

    instance-of v10, v4, Landroid/widget/FrameLayout;

    if-eqz v10, :cond_f

    check-cast v4, Landroid/widget/FrameLayout;

    invoke-virtual {v4, v8}, Landroid/view/View;->setForeground(Landroid/graphics/drawable/Drawable;)V

    :cond_f
    iget-object v4, p0, LE3;->l:Landroid/view/Window;

    invoke-virtual {v4, v2}, Landroid/view/Window;->setContentView(Landroid/view/View;)V

    new-instance v4, Ls3;

    invoke-direct {v4, p0, v7}, Ls3;-><init>(LE3;I)V

    invoke-virtual {v3, v4}, Landroidx/appcompat/widget/ContentFrameLayout;->setAttachListener(Lvb;)V

    iput-object v2, p0, LE3;->A:Landroid/view/ViewGroup;

    iget-object v2, p0, LE3;->j:Ljava/lang/Object;

    instance-of v3, v2, Landroid/app/Activity;

    if-eqz v3, :cond_10

    check-cast v2, Landroid/app/Activity;

    invoke-virtual {v2}, Landroid/app/Activity;->getTitle()Ljava/lang/CharSequence;

    move-result-object v2

    goto :goto_4

    :cond_10
    iget-object v2, p0, LE3;->q:Ljava/lang/CharSequence;

    :goto_4
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_13

    iget-object v3, p0, LE3;->r:LKc;

    if-eqz v3, :cond_11

    invoke-interface {v3, v2}, LKc;->setWindowTitle(Ljava/lang/CharSequence;)V

    goto :goto_5

    :cond_11
    iget-object v3, p0, LE3;->o:Ln0;

    if-eqz v3, :cond_12

    invoke-virtual {v3, v2}, Ln0;->o(Ljava/lang/CharSequence;)V

    goto :goto_5

    :cond_12
    iget-object v3, p0, LE3;->B:Landroid/widget/TextView;

    if-eqz v3, :cond_13

    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_13
    :goto_5
    iget-object v2, p0, LE3;->A:Landroid/view/ViewGroup;

    invoke-virtual {v2, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroidx/appcompat/widget/ContentFrameLayout;

    iget-object v3, p0, LE3;->l:Landroid/view/Window;

    invoke-virtual {v3}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getPaddingLeft()I

    move-result v4

    invoke-virtual {v3}, Landroid/view/View;->getPaddingTop()I

    move-result v8

    invoke-virtual {v3}, Landroid/view/View;->getPaddingRight()I

    move-result v9

    invoke-virtual {v3}, Landroid/view/View;->getPaddingBottom()I

    move-result v3

    iget-object v10, v2, Landroidx/appcompat/widget/ContentFrameLayout;->g:Landroid/graphics/Rect;

    invoke-virtual {v10, v4, v8, v9, v3}, Landroid/graphics/Rect;->set(IIII)V

    invoke-virtual {v2}, Landroid/view/View;->isLaidOut()Z

    move-result v3

    if-eqz v3, :cond_14

    invoke-virtual {v2}, Landroid/view/View;->requestLayout()V

    :cond_14
    invoke-virtual {v0, v1}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v0

    const/16 v1, 0x7c

    invoke-virtual {v2}, Landroidx/appcompat/widget/ContentFrameLayout;->getMinWidthMajor()Landroid/util/TypedValue;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    const/16 v1, 0x7d

    invoke-virtual {v2}, Landroidx/appcompat/widget/ContentFrameLayout;->getMinWidthMinor()Landroid/util/TypedValue;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    const/16 v1, 0x7a

    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v3

    if-eqz v3, :cond_15

    invoke-virtual {v2}, Landroidx/appcompat/widget/ContentFrameLayout;->getFixedWidthMajor()Landroid/util/TypedValue;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    :cond_15
    const/16 v1, 0x7b

    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v3

    if-eqz v3, :cond_16

    invoke-virtual {v2}, Landroidx/appcompat/widget/ContentFrameLayout;->getFixedWidthMinor()Landroid/util/TypedValue;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    :cond_16
    const/16 v1, 0x78

    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v3

    if-eqz v3, :cond_17

    invoke-virtual {v2}, Landroidx/appcompat/widget/ContentFrameLayout;->getFixedHeightMajor()Landroid/util/TypedValue;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    :cond_17
    const/16 v1, 0x79

    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v3

    if-eqz v3, :cond_18

    invoke-virtual {v2}, Landroidx/appcompat/widget/ContentFrameLayout;->getFixedHeightMinor()Landroid/util/TypedValue;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    :cond_18
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    invoke-virtual {v2}, Landroid/view/View;->requestLayout()V

    iput-boolean v7, p0, LE3;->z:Z

    invoke-virtual {p0, v5}, LE3;->z(I)LD3;

    move-result-object v0

    iget-boolean v1, p0, LE3;->Q:Z

    if-nez v1, :cond_1b

    iget-object v0, v0, LD3;->h:Llr;

    if-nez v0, :cond_1b

    invoke-virtual {p0, v6}, LE3;->B(I)V

    goto :goto_6

    :cond_19
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "AppCompat does not support the current theme features: { windowActionBar: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v2, p0, LE3;->F:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", windowActionBarOverlay: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, LE3;->G:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", android:windowIsFloating: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, LE3;->I:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", windowActionModeOverlay: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, LE3;->H:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", windowNoTitle: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, LE3;->J:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, " }"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1a
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "You need to use a Theme.AppCompat theme (or descendant) with this activity."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1b
    :goto_6
    return-void
.end method

.method public final x()V
    .locals 2

    iget-object v0, p0, LE3;->l:Landroid/view/Window;

    if-nez v0, :cond_0

    iget-object v0, p0, LE3;->j:Ljava/lang/Object;

    instance-of v1, v0, Landroid/app/Activity;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {p0, v0}, LE3;->o(Landroid/view/Window;)V

    :cond_0
    iget-object v0, p0, LE3;->l:Landroid/view/Window;

    if-eqz v0, :cond_1

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "We have not been given a Window"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final y(Landroid/content/Context;)LB3;
    .locals 3

    iget-object v0, p0, LE3;->W:Lz3;

    if-nez v0, :cond_1

    new-instance v0, Lz3;

    sget-object v1, Lw4;->g:Lw4;

    if-nez v1, :cond_0

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    new-instance v1, Lw4;

    const-string v2, "location"

    invoke-virtual {p1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/location/LocationManager;

    invoke-direct {v1, p1, v2}, Lw4;-><init>(Landroid/content/Context;Landroid/location/LocationManager;)V

    sput-object v1, Lw4;->g:Lw4;

    :cond_0
    sget-object p1, Lw4;->g:Lw4;

    invoke-direct {v0, p0, p1}, Lz3;-><init>(LE3;Lw4;)V

    iput-object v0, p0, LE3;->W:Lz3;

    :cond_1
    iget-object p1, p0, LE3;->W:Lz3;

    return-object p1
.end method

.method public final z(I)LD3;
    .locals 4

    iget-object v0, p0, LE3;->L:[LD3;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    array-length v2, v0

    if-gt v2, p1, :cond_2

    :cond_0
    add-int/lit8 v2, p1, 0x1

    new-array v2, v2, [LD3;

    if-eqz v0, :cond_1

    array-length v3, v0

    invoke-static {v0, v1, v2, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_1
    iput-object v2, p0, LE3;->L:[LD3;

    move-object v0, v2

    :cond_2
    aget-object v2, v0, p1

    if-nez v2, :cond_3

    new-instance v2, LD3;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iput p1, v2, LD3;->a:I

    iput-boolean v1, v2, LD3;->n:Z

    aput-object v2, v0, p1

    :cond_3
    return-object v2
.end method
