.class public final Lg8;
.super LZk;
.source ""


# static fields
.field public static final b:Lg8;

.field public static final c:Ljava/lang/String;

.field public static d:LyA;

.field public static e:LyA;

.field public static f:LyA;

.field public static final g:LKf;

.field public static final h:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    const-wide v0, -0xe9c9fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0xe9e3fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0xe9fdfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0xe99ffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0xe9b5fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0xe84cfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0xe866fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    new-instance v0, Lg8;

    new-instance v1, Lvx;

    const-wide v2, -0xe0f4fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const-wide v3, -0xe08efffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    const-wide v4, -0xe08ffffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    const-wide v5, -0xe097fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    new-instance v6, LZ4;

    const/4 v7, 0x2

    invoke-direct {v6, v7}, LZ4;-><init>(I)V

    invoke-direct/range {v1 .. v6}, Lvx;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;)V

    new-instance v2, LZz;

    const-wide v3, -0xe0a6fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    const-wide v4, -0xe0acfffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    const-wide v5, -0xef45fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    const-wide v6, -0xef4cfffff835L

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

    sput-object v0, Lg8;->b:Lg8;

    sget-object v0, LNx;->a:Landroid/content/SharedPreferences;

    const-wide v0, -0xe87afffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const-wide v1, -0xe814fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, LNx;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lg8;->c:Ljava/lang/String;

    sget-object v0, LKf;->a:LKf;

    sput-object v0, Lg8;->g:LKf;

    const-wide v0, -0xe815fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const-wide v1, -0xe81bfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    new-instance v2, LEt;

    invoke-direct {v2, v0, v1}, LEt;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-wide v0, -0xe83ffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const-wide v3, -0xe8c6fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    new-instance v3, LEt;

    invoke-direct {v3, v0, v1}, LEt;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-wide v0, -0xe886fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const-wide v4, -0xe88cfffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    new-instance v4, LEt;

    invoke-direct {v4, v0, v1}, LEt;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-wide v0, -0xe8bdfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const-wide v5, -0x1743fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    new-instance v5, LEt;

    invoke-direct {v5, v0, v1}, LEt;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v2, v3, v4, v5}, [LEt;

    move-result-object v0

    invoke-static {v0}, Lsa;->b0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lg8;->h:Ljava/util/List;

    return-void
.end method

.method public static f(IIII)I
    .locals 2

    if-gtz p2, :cond_0

    const/16 p2, 0x438

    :cond_0
    if-gtz p3, :cond_1

    const/16 p3, 0x780

    :cond_1
    const/4 v0, 0x1

    if-gt p1, p3, :cond_3

    if-le p0, p2, :cond_2

    goto :goto_0

    :cond_2
    return v0

    :cond_3
    :goto_0
    div-int/lit8 p1, p1, 0x2

    div-int/lit8 p0, p0, 0x2

    :goto_1
    div-int v1, p1, v0

    if-lt v1, p3, :cond_4

    div-int v1, p0, v0

    if-lt v1, p2, :cond_4

    mul-int/lit8 v0, v0, 0x2

    goto :goto_1

    :cond_4
    return v0
.end method

.method public static g(Landroid/view/ViewGroup;)V
    .locals 4

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v3

    instance-of v3, v3, Landroid/graphics/drawable/ColorDrawable;

    if-eqz v3, :cond_0

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    instance-of v3, v2, Landroid/view/ViewGroup;

    if-eqz v3, :cond_1

    check-cast v2, Landroid/view/ViewGroup;

    invoke-static {v2}, Lg8;->g(Landroid/view/ViewGroup;)V

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public static h(Landroid/view/View;Landroid/view/ViewGroup;)V
    .locals 3

    :goto_0
    if-eqz p0, :cond_3

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-wide v1, -0xeb4afffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    instance-of v1, v1, Landroid/graphics/drawable/ColorDrawable;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    if-eqz v0, :cond_1

    :cond_0
    invoke-virtual {p0, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    :cond_1
    if-eq p0, p1, :cond_3

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p0

    instance-of v0, p0, Landroid/view/View;

    if-eqz v0, :cond_2

    check-cast p0, Landroid/view/View;

    goto :goto_0

    :cond_2
    move-object p0, v2

    goto :goto_0

    :cond_3
    return-void
.end method

.method public static i()Ljava/lang/String;
    .locals 3

    sget-object v0, LNx;->a:Landroid/content/SharedPreferences;

    const-wide v0, -0xed14fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const-wide v1, -0xed2efffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, LNx;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static k(Landroid/view/ViewGroup;)Z
    .locals 6

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v3

    const-wide v4, -0xeb6ffffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public static l()Ljava/lang/String;
    .locals 4

    sget-object v0, LNx;->a:Landroid/content/SharedPreferences;

    const-wide v0, -0xed7cfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const-wide v1, -0xed13fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, LNx;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v2, -0xee21fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const-wide v0, -0xee26fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static m()Z
    .locals 2

    sget-object v0, LNx;->a:Landroid/content/SharedPreferences;

    const-wide v0, -0xed66fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, LNx;->a(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static n()V
    .locals 4

    sget-object v0, Lg8;->d:LyA;

    if-eqz v0, :cond_1

    invoke-static {}, Lg8;->m()Z

    move-result v1

    if-eqz v1, :cond_0

    const-wide v1, -0xee0ffffff835L

    :goto_0
    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_0
    const-wide v1, -0xee18fffff835L

    goto :goto_0

    :goto_1
    invoke-virtual {v0, v1}, LyA;->setSummary(Ljava/lang/String;)V

    :cond_1
    sget-object v0, Lg8;->e:LyA;

    if-eqz v0, :cond_2

    invoke-static {}, Lg8;->l()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LyA;->setSummary(Ljava/lang/String;)V

    :cond_2
    sget-object v0, Lg8;->f:LyA;

    if-eqz v0, :cond_4

    invoke-static {}, Lg8;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_3

    const-wide v2, -0xee35fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    :cond_3
    const-wide v1, -0xee3afffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    :goto_2
    invoke-virtual {v0, v1}, LyA;->setSummary(Ljava/lang/String;)V

    :cond_4
    return-void
.end method

.method public static o()V
    .locals 3

    sget-object v0, LNx;->a:Landroid/content/SharedPreferences;

    const-wide v0, -0xeecefffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, LNx;->c(Ljava/lang/String;Z)V

    const-wide v0, -0xeee4fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const-wide v1, -0xed48fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0xed4cfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, LNx;->e(Ljava/lang/String;Ljava/lang/String;)V

    const-wide v0, -0xeee5fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, LNx;->c(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    sget-object v0, Lds;->a:Lds;

    new-instance v1, Le8;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Le8;-><init>(I)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide v2, -0x57b9fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, Lds;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-wide v0, -0xedebfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    new-instance v1, LF7;

    const/16 v2, 0xd

    invoke-direct {v1, v2}, LF7;-><init>(I)V

    const-wide v2, -0x20f0afffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    const-wide v2, -0x20f11fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    const-wide v2, -0x20f04fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    new-instance v2, Lqs;

    sget v3, LgG;->a:I

    invoke-static {v0}, LfG;->r0(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const/16 v3, 0xb

    invoke-direct {v2, v3, v0}, Lqs;-><init>(ILjava/lang/Class;)V

    invoke-virtual {v2, v1}, Lqs;->f(Lfj;)V

    return-void
.end method

.method public final b()Ljava/lang/String;
    .locals 2

    const-wide v0, -0xef5bfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final d(Landroid/content/Context;)Ljava/util/ArrayList;
    .locals 6

    const-wide v0, -0xef73fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-super {p0, p1}, LZk;->d(Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object v0

    const-wide v1, -0xef7bfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    new-instance v1, LaA;

    invoke-direct {v1, p1}, LaA;-><init>(Landroid/content/Context;)V

    const-wide v2, -0xefc7fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, LaA;->setKey(Ljava/lang/String;)V

    const-wide v2, -0xefe9fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, LaA;->setTitle(Ljava/lang/String;)V

    const-wide v2, -0xeff2fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, LaA;->setSummary(Ljava/lang/String;)V

    sget-object v2, LNx;->a:Landroid/content/SharedPreferences;

    const-wide v2, -0xef8afffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v2, v3}, LNx;->a(Ljava/lang/String;Z)Z

    move-result v2

    invoke-virtual {v1, v2}, LaA;->setChecked(Z)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, LaA;

    invoke-direct {v1, p1}, LaA;-><init>(Landroid/content/Context;)V

    const-wide v4, -0xefacfffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, LaA;->setKey(Ljava/lang/String;)V

    const-wide v4, -0xee46fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, LaA;->setTitle(Ljava/lang/String;)V

    const-wide v4, -0xee4bfffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, LaA;->setSummary(Ljava/lang/String;)V

    const-wide v4, -0xee61fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v3}, LNx;->a(Ljava/lang/String;Z)Z

    move-result v2

    invoke-virtual {v1, v2}, LaA;->setChecked(Z)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, LyA;

    invoke-direct {v1, p1}, LyA;-><init>(Landroid/content/Context;)V

    const-wide v2, -0xee7bfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, LyA;->setTitle(Ljava/lang/String;)V

    sget-object v2, Lg8;->b:Lg8;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lg8;->m()Z

    move-result v2

    if-eqz v2, :cond_0

    const-wide v2, -0xee0ffffff835L

    :goto_0
    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_0
    const-wide v2, -0xee18fffff835L

    goto :goto_0

    :goto_1
    invoke-virtual {v1, v2}, LyA;->setSummary(Ljava/lang/String;)V

    invoke-virtual {v1}, LyA;->a()V

    new-instance v2, LZ4;

    const/4 v3, 0x3

    invoke-direct {v2, v3}, LZ4;-><init>(I)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    sput-object v1, Lg8;->d:LyA;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, LyA;

    invoke-direct {v1, p1}, LyA;-><init>(Landroid/content/Context;)V

    const-wide v2, -0xee00fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, LyA;->setTitle(Ljava/lang/String;)V

    invoke-static {}, Lg8;->l()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, LyA;->setSummary(Ljava/lang/String;)V

    invoke-virtual {v1}, LyA;->a()V

    new-instance v2, LZ4;

    const/4 v3, 0x4

    invoke-direct {v2, v3}, LZ4;-><init>(I)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    sput-object v1, Lg8;->e:LyA;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, LyA;

    invoke-direct {v1, p1}, LyA;-><init>(Landroid/content/Context;)V

    const-wide v2, -0xee07fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, LyA;->setTitle(Ljava/lang/String;)V

    invoke-static {}, Lg8;->i()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_1

    const-wide v2, -0xee35fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    :cond_1
    const-wide v2, -0xee3afffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    :goto_2
    invoke-virtual {v1, p1}, LyA;->setSummary(Ljava/lang/String;)V

    invoke-virtual {v1}, LyA;->a()V

    new-instance p1, LZ4;

    const/4 v2, 0x5

    invoke-direct {p1, v2}, LZ4;-><init>(I)V

    invoke-virtual {v1, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    sput-object v1, Lg8;->f:LyA;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public final j()Z
    .locals 3

    invoke-virtual {p0}, LZk;->e()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Lg8;->m()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, LNx;->a:Landroid/content/SharedPreferences;

    const-wide v0, -0xed7cfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const-wide v1, -0xed13fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, LNx;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lg8;->i()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_2

    goto :goto_0

    :cond_1
    sget-object v0, Lg8;->c:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_2

    :goto_0
    const/4 v0, 0x1

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method
