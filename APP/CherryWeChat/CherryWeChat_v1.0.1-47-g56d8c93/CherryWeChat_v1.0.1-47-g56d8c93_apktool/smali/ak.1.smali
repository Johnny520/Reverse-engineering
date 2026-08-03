.class public final Lak;
.super LZk;
.source ""


# static fields
.field public static final b:Lak;

.field public static c:Landroid/graphics/Typeface;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lak;

    new-instance v1, Lvx;

    const-wide v2, -0x1850fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const-wide v3, -0x1869fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    const-wide v4, -0x186afffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    const-wide v5, -0x1871fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    new-instance v6, LZ4;

    const/16 v7, 0x9

    invoke-direct {v6, v7}, LZ4;-><init>(I)V

    invoke-direct/range {v1 .. v6}, Lvx;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;)V

    new-instance v2, LZz;

    const-wide v3, -0x1805fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    const-wide v4, -0x180afffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    const-wide v5, -0x181efffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    const-wide v6, -0x1826fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    const/4 v8, 0x1

    move-object v7, v1

    move-object v1, v2

    move-object v2, v3

    move-object v3, v4

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v8}, LZz;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lvx;Z)V

    invoke-direct {v0, v1}, LZk;-><init>(LZz;)V

    sput-object v0, Lak;->b:Lak;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 12

    sget-object v0, Lds;->a:Lds;

    new-instance v1, Le8;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Le8;-><init>(I)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide v2, -0x57b9fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, Lds;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, LZk;->e()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, LNx;->a:Landroid/content/SharedPreferences;

    const-wide v0, -0x71afffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const-wide v1, -0x733fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, LNx;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {v0}, Landroid/graphics/Typeface;->createFromFile(Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v0

    sput-object v0, Lak;->c:Landroid/graphics/Typeface;

    if-nez v0, :cond_2

    :goto_0
    return-void

    :cond_2
    new-instance v0, LOb;

    const/16 v1, 0xb

    invoke-direct {v0, v1}, LOb;-><init>(I)V

    const-wide v2, -0x20f1afffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    const-wide v4, -0x20f21fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    const-wide v6, -0x20f7efffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    new-instance v8, Lqs;

    const-class v9, Landroid/widget/TextView;

    invoke-direct {v8, v1, v9}, Lqs;-><init>(ILjava/lang/Class;)V

    invoke-virtual {v8, v0}, Lqs;->f(Lfj;)V

    new-instance v0, LiG;

    invoke-direct {v0, v9}, LiG;-><init>(Ljava/lang/Object;)V

    const-wide v10, -0x734fffff835L

    invoke-static {v10, v11}, LGu;->r(J)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v8}, LiG;->f(Ljava/lang/String;)V

    const-class v8, Landroid/graphics/Typeface;

    filled-new-array {v8}, [Ljava/lang/Object;

    move-result-object v10

    invoke-virtual {v0, v10}, LiG;->g([Ljava/lang/Object;)V

    new-instance v10, LOb;

    const/16 v11, 0xc

    invoke-direct {v10, v11}, LOb;-><init>(I)V

    invoke-virtual {v0, v10}, LiG;->b(Lfj;)V

    new-instance v0, LiG;

    invoke-direct {v0, v9}, LiG;-><init>(Ljava/lang/Object;)V

    const-wide v9, -0x7c0fffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v0, v9}, LiG;->f(Ljava/lang/String;)V

    sget-object v9, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    filled-new-array {v8, v9}, [Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v0, v9}, LiG;->g([Ljava/lang/Object;)V

    new-instance v9, LOb;

    const/16 v10, 0xd

    invoke-direct {v9, v10}, LOb;-><init>(I)V

    invoke-virtual {v0, v9}, LiG;->b(Lfj;)V

    new-instance v0, LOb;

    const/16 v9, 0xe

    invoke-direct {v0, v9}, LOb;-><init>(I)V

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    new-instance v2, Lqs;

    const-class v3, Landroid/graphics/Paint;

    invoke-direct {v2, v1, v3}, Lqs;-><init>(ILjava/lang/Class;)V

    invoke-virtual {v2, v0}, Lqs;->f(Lfj;)V

    new-instance v0, LiG;

    invoke-direct {v0, v3}, LiG;-><init>(Ljava/lang/Object;)V

    const-wide v1, -0x7ccfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LiG;->f(Ljava/lang/String;)V

    filled-new-array {v8}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, LiG;->g([Ljava/lang/Object;)V

    new-instance v1, LOb;

    const/16 v2, 0xf

    invoke-direct {v1, v2}, LOb;-><init>(I)V

    invoke-virtual {v0, v1}, LiG;->b(Lfj;)V

    return-void
.end method

.method public final b()Ljava/lang/String;
    .locals 2

    const-wide v0, -0x1839fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final d(Landroid/content/Context;)Ljava/util/ArrayList;
    .locals 5

    const-wide v0, -0x773fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-super {p0, p1}, LZk;->d(Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object p1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p1

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ge v2, p1, :cond_0

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    instance-of v2, p1, LyA;

    if-eqz v2, :cond_1

    move-object v1, p1

    check-cast v1, LyA;

    :cond_1
    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    sget-object p1, LNx;->a:Landroid/content/SharedPreferences;

    const-wide v2, -0x77bfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    const-wide v2, -0x714fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v2}, LNx;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v3, -0x715fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v3, Ljava/io/File;

    invoke-direct {v3, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, LyA;->setSummary(Ljava/lang/String;)V

    :cond_3
    :goto_1
    return-object v0
.end method
