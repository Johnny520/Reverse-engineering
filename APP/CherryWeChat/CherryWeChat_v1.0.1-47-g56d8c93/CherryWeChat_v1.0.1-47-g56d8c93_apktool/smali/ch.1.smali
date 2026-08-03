.class public final Lch;
.super LZk;
.source ""


# static fields
.field public static final b:Lch;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lch;

    new-instance v1, Lvx;

    const-wide v2, -0x1b8afffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const-wide v3, -0x1ba5fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    const-wide v4, -0x1ba6fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    const-wide v5, -0x1baefffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    new-instance v6, LZ4;

    const/4 v7, 0x7

    invoke-direct {v6, v7}, LZ4;-><init>(I)V

    invoke-direct/range {v1 .. v6}, Lvx;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;)V

    new-instance v2, LZz;

    const-wide v3, -0x1bb9fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    const-wide v4, -0x1bbefffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    const-wide v5, -0x1a53fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    const-wide v6, -0x1a59fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    const/16 v8, 0x40

    move-object v7, v1

    move-object v1, v2

    move-object v2, v3

    move-object v3, v4

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v8}, LZz;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lvx;I)V

    invoke-direct {v0, v1}, LZk;-><init>(LZz;)V

    sput-object v0, Lch;->b:Lch;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    const-wide v0, -0x1a7cfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const-wide v1, -0x20df5fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    new-instance v1, LiG;

    sget v2, LgG;->a:I

    invoke-static {v0}, LfG;->r0(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    invoke-direct {v1, v0}, LiG;-><init>(Ljava/lang/Object;)V

    const-class v0, Landroid/view/View;

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v1, v0}, LiG;->g([Ljava/lang/Object;)V

    new-instance v0, LOb;

    const/16 v2, 0x9

    invoke-direct {v0, v2}, LOb;-><init>(I)V

    invoke-virtual {v1, v0}, LiG;->a(Lfj;)V

    return-void
.end method

.method public final b()Ljava/lang/String;
    .locals 2

    const-wide v0, -0x1a69fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final f(Landroid/view/ViewGroup;)V
    .locals 8

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_5

    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    instance-of v4, v3, Landroid/widget/TextView;

    if-eqz v4, :cond_3

    move-object v4, v3

    check-cast v4, Landroid/widget/TextView;

    invoke-virtual {v4}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v5

    const-wide v6, -0x1a39fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    const-wide v6, -0x1ac6fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6, v1}, Ltz;->L(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-virtual {p0}, LZk;->c()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    const-wide v0, -0x1acbfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v4, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_3
    instance-of v4, v3, Landroid/view/ViewGroup;

    if-eqz v4, :cond_4

    check-cast v3, Landroid/view/ViewGroup;

    invoke-virtual {p0, v3}, Lch;->f(Landroid/view/ViewGroup;)V

    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_5
    :goto_1
    return-void
.end method
