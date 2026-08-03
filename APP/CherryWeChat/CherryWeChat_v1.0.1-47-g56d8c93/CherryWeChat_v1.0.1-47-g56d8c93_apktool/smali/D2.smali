.class public LD2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LCr;
.implements Ljr;
.implements Lpr;
.implements LNd;
.implements Lwb;
.implements Lyb;
.implements Lgt;
.implements Lbs;
.implements LTc;
.implements LYg;
.implements Lxc;


# static fields
.field public static final c:Ljava/lang/Object;

.field public static final d:Lsj;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, LD2;->c:Ljava/lang/Object;

    new-instance v0, Lsj;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lsj;-><init>(I)V

    sput-object v0, LD2;->d:Lsj;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 4

    iput p1, p0, LD2;->a:I

    sparse-switch p1, :sswitch_data_0

    .line 19
    new-instance p1, Lkq;

    .line 20
    :try_start_0
    const-string v0, "com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    .line 21
    const-string v1, "getInstance"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {v0, v2, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LJr;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 22
    :catch_0
    sget-object v0, LD2;->d:Lsj;

    :goto_0
    const/4 v1, 0x2

    .line 23
    new-array v1, v1, [LJr;

    sget-object v2, Lsj;->b:Lsj;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v0, v1, v2

    .line 24
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object v1, p1, Lkq;->a:[LJr;

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    sget-object v0, LLl;->a:Ljava/nio/charset/Charset;

    iput-object p1, p0, LD2;->b:Ljava/lang/Object;

    return-void

    .line 28
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    new-instance p1, LXm;

    const/4 v0, 0x7

    invoke-direct {p1, v0}, LXm;-><init>(I)V

    iput-object p1, p0, LD2;->b:Ljava/lang/Object;

    return-void

    .line 30
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    const/16 v0, 0x10

    invoke-direct {p1, v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(I)V

    .line 32
    iput-object p1, p0, LD2;->b:Ljava/lang/Object;

    return-void

    .line 33
    :sswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    new-instance p1, Lm6;

    const/16 v0, 0x9

    .line 35
    invoke-direct {p1, v0}, Lm6;-><init>(I)V

    .line 36
    iput-object p1, p0, LD2;->b:Ljava/lang/Object;

    return-void

    .line 37
    :sswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    new-instance p1, Lb0;

    .line 39
    invoke-direct {p1, p0}, Lb0;-><init>(LD2;)V

    .line 40
    iput-object p1, p0, LD2;->b:Ljava/lang/Object;

    return-void

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_3
        0xe -> :sswitch_2
        0x10 -> :sswitch_1
        0x19 -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LD2;->a:I

    iput-object p2, p0, LD2;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(LC2;)V
    .locals 3

    const/4 v0, 0x0

    iput v0, p0, LD2;->a:I

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    iget-object v0, p1, LC2;->b:Ljava/lang/Object;

    check-cast v0, Landroid/content/Context;

    .line 43
    iget-object v1, p1, LC2;->c:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    .line 44
    iget-object v2, p1, LC2;->d:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    if-eqz v1, :cond_1

    .line 45
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    if-nez v2, :cond_0

    .line 46
    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 47
    invoke-virtual {v0, v2, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 48
    :goto_0
    iget-object p1, p1, LC2;->h:Ljava/lang/Object;

    check-cast p1, LXm;

    .line 49
    iput-object p1, p0, LD2;->b:Ljava/lang/Object;

    return-void

    .line 50
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "keysetName cannot be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Landroid/content/ClipData;I)V
    .locals 1

    const/16 v0, 0xb

    iput v0, p0, LD2;->a:I

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    invoke-static {p1, p2}, LW5;->i(Landroid/content/ClipData;I)Landroid/view/ContentInfo$Builder;

    move-result-object p1

    iput-object p1, p0, LD2;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const/16 v0, 0x1d

    iput v0, p0, LD2;->a:I

    .line 9
    new-instance v0, LSd;

    const/4 v1, 0x4

    invoke-direct {v0, p1, v1}, LSd;-><init>(Landroid/content/Context;I)V

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object v0, p0, LD2;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/view/ContentInfo;)V
    .locals 1

    const/16 v0, 0xc

    iput v0, p0, LD2;->a:I

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    invoke-static {p1}, LW5;->k(Ljava/lang/Object;)Landroid/view/ContentInfo;

    move-result-object p1

    iput-object p1, p0, LD2;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/widget/EditText;)V
    .locals 2

    const/16 v0, 0x13

    iput v0, p0, LD2;->a:I

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    new-instance v0, LP3;

    const/16 v1, 0xe

    invoke-direct {v0, p1, v1}, LP3;-><init>(Landroid/widget/EditText;I)V

    iput-object v0, p0, LD2;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/widget/TextView;)V
    .locals 1

    const/16 v0, 0x14

    iput v0, p0, LD2;->a:I

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    new-instance v0, LCf;

    invoke-direct {v0, p1}, LCf;-><init>(Landroid/widget/TextView;)V

    iput-object v0, p0, LD2;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;Lzp;)V
    .locals 1

    const/16 v0, 0x1c

    iput v0, p0, LD2;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Ldv;

    invoke-direct {v0, p1, p2}, Ldv;-><init>(Ljava/io/InputStream;Lzp;)V

    iput-object v0, p0, LD2;->b:Ljava/lang/Object;

    const/high16 p1, 0x500000

    .line 4
    invoke-virtual {v0, p1}, Ldv;->mark(I)V

    return-void
.end method

.method public constructor <init>(Lma;)V
    .locals 1

    const/16 v0, 0x9

    iput v0, p0, LD2;->a:I

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    const-string v0, "output"

    invoke-static {v0, p1}, LLl;->a(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object p1, p0, LD2;->b:Ljava/lang/Object;

    .line 14
    iput-object p0, p1, Lma;->f:LD2;

    return-void
.end method

.method public constructor <init>(Lyc;)V
    .locals 1

    const/16 v0, 0x18

    iput v0, p0, LD2;->a:I

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    new-instance v0, Ljava/util/HashMap;

    .line 7
    iget-object p1, p1, Lyc;->a:Ljava/util/HashMap;

    .line 8
    invoke-direct {v0, p1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, LD2;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public A(ILjava/lang/Object;Lmx;)V
    .locals 2

    iget-object v0, p0, LD2;->b:Ljava/lang/Object;

    check-cast v0, Lma;

    check-cast p2, LB;

    const/4 v1, 0x2

    invoke-virtual {v0, p1, v1}, Lma;->a0(II)V

    invoke-virtual {p2, p3}, LB;->b(Lmx;)I

    move-result p1

    invoke-virtual {v0, p1}, Lma;->b0(I)V

    iget-object p1, v0, Lma;->f:LD2;

    invoke-interface {p3, p2, p1}, Lmx;->a(Ljava/lang/Object;LD2;)V

    return-void
.end method

.method public a()Landroid/content/ClipData;
    .locals 1

    iget-object v0, p0, LD2;->b:Ljava/lang/Object;

    check-cast v0, Landroid/view/ContentInfo;

    invoke-static {v0}, LW5;->e(Landroid/view/ContentInfo;)Landroid/content/ClipData;

    move-result-object v0

    return-object v0
.end method

.method public b(Llr;Z)V
    .locals 2

    instance-of v0, p1, LEz;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LEz;

    iget-object v0, v0, LEz;->z:Llr;

    invoke-virtual {v0}, Llr;->k()Llr;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Llr;->c(Z)V

    :cond_0
    iget-object v0, p0, LD2;->b:Ljava/lang/Object;

    check-cast v0, LD0;

    iget-object v0, v0, LD0;->e:LCr;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1, p2}, LCr;->b(Llr;Z)V

    :cond_1
    return-void
.end method

.method public build()Lzb;
    .locals 3

    new-instance v0, Lzb;

    new-instance v1, LD2;

    iget-object v2, p0, LD2;->b:Ljava/lang/Object;

    check-cast v2, Landroid/view/ContentInfo$Builder;

    invoke-static {v2}, LW5;->j(Landroid/view/ContentInfo$Builder;)Landroid/view/ContentInfo;

    move-result-object v2

    invoke-direct {v1, v2}, LD2;-><init>(Landroid/view/ContentInfo;)V

    invoke-direct {v0, v1}, Lzb;-><init>(Lyb;)V

    return-object v0
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, LD2;->b:Ljava/lang/Object;

    check-cast v0, Ldv;

    invoke-virtual {v0}, Ldv;->f()V

    return-void
.end method

.method public d(Llr;Landroid/view/MenuItem;)Z
    .locals 3

    iget-object p1, p0, LD2;->b:Ljava/lang/Object;

    check-cast p1, Landroidx/appcompat/widget/ActionMenuView;

    iget-object p1, p1, Landroidx/appcompat/widget/ActionMenuView;->A:LG0;

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    check-cast p1, LnB;

    iget-object p1, p1, LnB;->a:Landroidx/appcompat/widget/Toolbar;

    iget-object v1, p1, Landroidx/appcompat/widget/Toolbar;->G:Lw4;

    invoke-virtual {v1}, Lw4;->B()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    move p1, v2

    goto :goto_0

    :cond_0
    iget-object p1, p1, Landroidx/appcompat/widget/Toolbar;->I:LrB;

    if-eqz p1, :cond_1

    check-cast p1, LtB;

    iget-object p1, p1, LtB;->a:LuB;

    iget-object p1, p1, LuB;->b:Landroid/view/Window$Callback;

    invoke-interface {p1, v0, p2}, Landroid/view/Window$Callback;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    move-result p1

    goto :goto_0

    :cond_1
    move p1, v0

    :goto_0
    if-eqz p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public e(Llr;Landroid/view/MenuItem;)V
    .locals 0

    iget-object p2, p0, LD2;->b:Ljava/lang/Object;

    check-cast p2, La7;

    iget-object p2, p2, La7;->f:Landroid/os/Handler;

    invoke-virtual {p2, p1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    return-void
.end method

.method public f()S
    .locals 2

    iget-object v0, p0, LD2;->b:Ljava/lang/Object;

    check-cast v0, Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    int-to-short v0, v0

    return v0

    :cond_0
    new-instance v0, LSc;

    invoke-direct {v0}, LSc;-><init>()V

    throw v0
.end method

.method public g()Ljava/lang/Object;
    .locals 9

    iget v0, p0, LD2;->a:I

    packed-switch v0, :pswitch_data_0

    new-instance v1, Lig;

    iget-object v0, p0, LD2;->b:Ljava/lang/Object;

    check-cast v0, LC2;

    iget-object v2, v0, LC2;->b:Ljava/lang/Object;

    check-cast v2, LWj;

    iget-object v3, v0, LC2;->c:Ljava/lang/Object;

    check-cast v3, LWj;

    iget-object v4, v0, LC2;->d:Ljava/lang/Object;

    check-cast v4, LWj;

    iget-object v5, v0, LC2;->e:Ljava/lang/Object;

    check-cast v5, LWj;

    iget-object v6, v0, LC2;->f:Ljava/lang/Object;

    check-cast v6, Lcg;

    iget-object v7, v0, LC2;->g:Ljava/lang/Object;

    check-cast v7, Lcg;

    iget-object v0, v0, LC2;->h:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Lw4;

    invoke-direct/range {v1 .. v8}, Lig;-><init>(LWj;LWj;LWj;LWj;Lcg;Lcg;Lw4;)V

    return-object v1

    :pswitch_0
    new-instance v0, LHc;

    iget-object v1, p0, LD2;->b:Ljava/lang/Object;

    check-cast v1, LL3;

    iget-object v2, v1, LL3;->c:Ljava/lang/Object;

    check-cast v2, LBb;

    iget-object v1, v1, LL3;->d:Ljava/lang/Object;

    check-cast v1, Lw4;

    invoke-direct {v0, v2, v1}, LHc;-><init>(LBb;Lw4;)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x15
        :pswitch_0
    .end packed-switch
.end method

.method public h()I
    .locals 2

    invoke-virtual {p0}, LD2;->f()S

    move-result v0

    shl-int/lit8 v0, v0, 0x8

    invoke-virtual {p0}, LD2;->f()S

    move-result v1

    or-int/2addr v0, v1

    return v0
.end method

.method public i(Llr;Lqr;)V
    .locals 7

    iget-object v0, p0, LD2;->b:Ljava/lang/Object;

    check-cast v0, La7;

    iget-object v1, v0, La7;->f:Landroid/os/Handler;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iget-object v0, v0, La7;->h:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v4, 0x0

    :goto_0
    const/4 v5, -0x1

    if-ge v4, v3, :cond_1

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LZ6;

    iget-object v6, v6, LZ6;->b:Llr;

    if-ne p1, v6, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    move v4, v5

    :goto_1
    if-ne v4, v5, :cond_2

    return-void

    :cond_2
    add-int/lit8 v4, v4, 0x1

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v4, v3, :cond_3

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, LZ6;

    :cond_3
    new-instance v0, LY6;

    invoke-direct {v0, p0, v2, p2, p1}, LY6;-><init>(LD2;LZ6;Lqr;Llr;)V

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2

    const-wide/16 v4, 0xc8

    add-long/2addr v2, v4

    invoke-virtual {v1, v0, p1, v2, v3}, Landroid/os/Handler;->postAtTime(Ljava/lang/Runnable;Ljava/lang/Object;J)Z

    return-void
.end method

.method public j()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LD2;->b:Ljava/lang/Object;

    check-cast v0, Ldv;

    invoke-virtual {v0}, Ldv;->reset()V

    return-object v0
.end method

.method public k()I
    .locals 1

    iget-object v0, p0, LD2;->b:Ljava/lang/Object;

    check-cast v0, Landroid/view/ContentInfo;

    invoke-static {v0}, LW5;->c(Landroid/view/ContentInfo;)I

    move-result v0

    return v0
.end method

.method public l(I[B)I
    .locals 4

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    const/4 v2, -0x1

    if-ge v0, p1, :cond_0

    iget-object v1, p0, LD2;->b:Ljava/lang/Object;

    check-cast v1, Ljava/io/InputStream;

    sub-int v3, p1, v0

    invoke-virtual {v1, p2, v0, v3}, Ljava/io/InputStream;->read([BII)I

    move-result v1

    if-eq v1, v2, :cond_0

    add-int/2addr v0, v1

    goto :goto_0

    :cond_0
    if-nez v0, :cond_2

    if-eq v1, v2, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, LSc;

    invoke-direct {p1}, LSc;-><init>()V

    throw p1

    :cond_2
    :goto_1
    return v0
.end method

.method public m()Landroid/view/ContentInfo;
    .locals 1

    iget-object v0, p0, LD2;->b:Ljava/lang/Object;

    check-cast v0, Landroid/view/ContentInfo;

    return-object v0
.end method

.method public n(Llr;)V
    .locals 1

    iget-object v0, p0, LD2;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/appcompat/widget/ActionMenuView;

    iget-object v0, v0, Landroidx/appcompat/widget/ActionMenuView;->v:Ljr;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Ljr;->n(Llr;)V

    :cond_0
    return-void
.end method

.method public o(Landroid/net/Uri;)V
    .locals 1

    iget-object v0, p0, LD2;->b:Ljava/lang/Object;

    check-cast v0, Landroid/view/ContentInfo$Builder;

    invoke-static {v0, p1}, LW5;->n(Landroid/view/ContentInfo$Builder;Landroid/net/Uri;)V

    return-void
.end method

.method public onApplyWindowInsets(Landroid/view/View;LLF;)LLF;
    .locals 5

    iget-object p1, p2, LLF;->a:LHF;

    iget-object v0, p0, LD2;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    iget-object v1, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->n:LLF;

    invoke-static {v1, p2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    iput-object p2, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->n:LLF;

    invoke-virtual {p2}, LLF;->d()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-lez v1, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    iput-boolean v1, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->o:Z

    if-nez v1, :cond_1

    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    move v3, v2

    :goto_1
    invoke-virtual {v0, v3}, Landroid/view/View;->setWillNotDraw(Z)V

    invoke-virtual {p1}, LHF;->n()Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_3

    :cond_2
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    :goto_2
    if-ge v2, v1, :cond_4

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    sget-object v4, LlE;->a:Ljava/util/WeakHashMap;

    invoke-virtual {v3}, Landroid/view/View;->getFitsSystemWindows()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, LTb;

    iget-object v3, v3, LTb;->a:LQb;

    if-eqz v3, :cond_3

    invoke-virtual {p1}, LHF;->n()Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_3

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_4
    :goto_3
    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    :cond_5
    return-object p2
.end method

.method public p(Lqs;)Las;
    .locals 2

    iget p1, p0, LD2;->a:I

    packed-switch p1, :pswitch_data_0

    new-instance p1, LTk;

    iget-object v0, p0, LD2;->b:Ljava/lang/Object;

    check-cast v0, LXm;

    invoke-direct {p1, v0}, LTk;-><init>(LXm;)V

    return-object p1

    :pswitch_0
    new-instance p1, Lh6;

    iget-object v0, p0, LD2;->b:Ljava/lang/Object;

    check-cast v0, Lm6;

    const/4 v1, 0x1

    invoke-direct {p1, v1, v0}, Lh6;-><init>(ILjava/lang/Object;)V

    return-object p1

    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_0
    .end packed-switch
.end method

.method public q()I
    .locals 1

    iget-object v0, p0, LD2;->b:Ljava/lang/Object;

    check-cast v0, Landroid/view/ContentInfo;

    invoke-static {v0}, LW5;->p(Landroid/view/ContentInfo;)I

    move-result v0

    return v0
.end method

.method public r(Landroid/widget/EditText;)V
    .locals 6

    iget-object v0, p0, LD2;->b:Ljava/lang/Object;

    check-cast v0, LX7;

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ltz;->e0(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_1

    sget-object v1, LNx;->a:Landroid/content/SharedPreferences;

    const-wide v2, -0x2fb13fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const-wide v3, -0x2fb2ffffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide v4, -0x1c73bfffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_0
    const-wide v2, -0x2fb30fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-wide v2, -0x2fb35fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    invoke-virtual {v0}, LX7;->b()V

    return-void

    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-wide v0, -0x1c7c0fffff835L

    const/4 v2, 0x0

    invoke-static {v0, v1, p1, v2}, LEy;->k(JLandroid/content/Context;I)V

    return-void
.end method

.method public s(Llr;)Z
    .locals 3

    iget-object v0, p0, LD2;->b:Ljava/lang/Object;

    check-cast v0, LD0;

    iget-object v1, v0, LD0;->c:Llr;

    const/4 v2, 0x0

    if-ne p1, v1, :cond_0

    return v2

    :cond_0
    move-object v1, p1

    check-cast v1, LEz;

    iget-object v1, v1, LEz;->A:Lqr;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, LD0;->e:LCr;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, LCr;->s(Llr;)Z

    move-result p1

    return p1

    :cond_1
    return v2
.end method

.method public setExtras(Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, LD2;->b:Ljava/lang/Object;

    check-cast v0, Landroid/view/ContentInfo$Builder;

    invoke-static {v0, p1}, LW5;->o(Landroid/view/ContentInfo$Builder;Landroid/os/Bundle;)V

    return-void
.end method

.method public skip(J)J
    .locals 8

    iget-object v0, p0, LD2;->b:Ljava/lang/Object;

    check-cast v0, Ljava/io/InputStream;

    const-wide/16 v1, 0x0

    cmp-long v3, p1, v1

    if-gez v3, :cond_0

    return-wide v1

    :cond_0
    move-wide v3, p1

    :goto_0
    cmp-long v5, v3, v1

    if-lez v5, :cond_3

    invoke-virtual {v0, v3, v4}, Ljava/io/InputStream;->skip(J)J

    move-result-wide v5

    cmp-long v7, v5, v1

    if-lez v7, :cond_1

    :goto_1
    sub-long/2addr v3, v5

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v5

    const/4 v6, -0x1

    if-ne v5, v6, :cond_2

    goto :goto_2

    :cond_2
    const-wide/16 v5, 0x1

    goto :goto_1

    :cond_3
    :goto_2
    sub-long/2addr p1, v3

    return-wide p1
.end method

.method public t(I)V
    .locals 1

    iget-object v0, p0, LD2;->b:Ljava/lang/Object;

    check-cast v0, Landroid/view/ContentInfo$Builder;

    invoke-static {v0, p1}, LW5;->m(Landroid/view/ContentInfo$Builder;I)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    iget v0, p0, LD2;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ContentInfoCompat{"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, LD2;->b:Ljava/lang/Object;

    check-cast v1, Landroid/view/ContentInfo;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0xc
        :pswitch_0
    .end packed-switch
.end method

.method public u(I)La0;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public v(I)La0;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public w()V
    .locals 1

    iget-object v0, p0, LD2;->b:Ljava/lang/Object;

    check-cast v0, Lji;

    iget-object v0, v0, Lji;->o:LAi;

    invoke-virtual {v0}, Lzi;->N()V

    return-void
.end method

.method public x(IILandroid/os/Bundle;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public y(ILy6;)V
    .locals 2

    iget-object v0, p0, LD2;->b:Ljava/lang/Object;

    check-cast v0, Lma;

    const/4 v1, 0x2

    invoke-virtual {v0, p1, v1}, Lma;->a0(II)V

    invoke-virtual {p2}, Ly6;->size()I

    move-result p1

    invoke-virtual {v0, p1}, Lma;->b0(I)V

    check-cast p2, Lx6;

    iget-object p1, p2, Lx6;->d:[B

    invoke-virtual {p2}, Lx6;->h()I

    move-result v1

    invoke-virtual {p2}, Lx6;->size()I

    move-result p2

    invoke-virtual {v0, p1, v1, p2}, Lma;->U([BII)V

    return-void
.end method

.method public z(ILjava/lang/Object;Lmx;)V
    .locals 2

    iget-object v0, p0, LD2;->b:Ljava/lang/Object;

    check-cast v0, Lma;

    check-cast p2, LB;

    const/4 v1, 0x3

    invoke-virtual {v0, p1, v1}, Lma;->a0(II)V

    iget-object v1, v0, Lma;->f:LD2;

    invoke-interface {p3, p2, v1}, Lmx;->a(Ljava/lang/Object;LD2;)V

    const/4 p2, 0x4

    invoke-virtual {v0, p1, p2}, Lma;->a0(II)V

    return-void
.end method
