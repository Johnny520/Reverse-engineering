.class public final LJ7;
.super LZk;
.source ""


# static fields
.field public static final b:LJ7;

.field public static final c:Ljava/util/Set;

.field public static final d:LMv;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, LJ7;

    new-instance v1, LZz;

    const-wide v2, -0xf87ffffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const-wide v3, -0xf804fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    const-wide v4, -0xf816fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    const-wide v6, -0xf822fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    const/16 v8, 0x60

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v8}, LZz;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lvx;I)V

    invoke-direct {v0, v1}, LZk;-><init>(LZz;)V

    sput-object v0, LJ7;->b:LJ7;

    const v0, 0x22000031

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const v2, 0x10002710

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const v3, 0x37000031

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, LLx;->B([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, LJ7;->c:Ljava/util/Set;

    new-instance v0, LMv;

    const-wide v1, -0xe776fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, LMv;-><init>(Ljava/lang/String;)V

    sput-object v0, LJ7;->d:LMv;

    return-void
.end method

.method public static f(LC2;Ljava/lang/Object;I)Z
    .locals 6

    const-wide v0, -0xf8ccfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0xf8dbfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    new-instance v0, LiG;

    invoke-direct {v0, p1}, LiG;-><init>(Ljava/lang/Object;)V

    const-wide v1, -0xf8e3fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LiG;->f(Ljava/lang/String;)V

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, LiG;->c(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    goto/16 :goto_0

    :cond_0
    new-instance v3, LC2;

    const/4 v4, 0x3

    invoke-direct {v3, v4, v0}, LC2;-><init>(ILjava/lang/Object;)V

    new-instance v0, LiG;

    invoke-direct {v0, p1}, LiG;-><init>(Ljava/lang/Object;)V

    const-wide v4, -0xf8ebfffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, LiG;->f(Ljava/lang/String;)V

    add-int/lit8 p1, p2, -0x1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, v2, p1}, LiG;->c(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    new-instance v0, LC2;

    const/4 v2, 0x3

    invoke-direct {v0, v2, p1}, LC2;-><init>(ILjava/lang/Object;)V

    iget-object p0, p0, LC2;->f:Ljava/lang/Object;

    check-cast p0, Landroid/widget/TextView;

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    move-result p1

    if-nez p1, :cond_2

    invoke-virtual {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result p0

    if-nez p0, :cond_5

    :cond_2
    iget-object p0, v3, LC2;->e:Ljava/lang/Object;

    check-cast p0, Ljava/lang/Integer;

    sget-object p1, LJ7;->c:Ljava/util/Set;

    if-eqz p0, :cond_3

    invoke-interface {p1, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_3

    return v1

    :cond_3
    if-lez p2, :cond_5

    iget-object p0, v0, LC2;->e:Ljava/lang/Object;

    check-cast p0, Ljava/lang/Integer;

    if-eqz p0, :cond_4

    invoke-interface {p1, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_4

    return v1

    :cond_4
    invoke-static {v3}, LJ7;->g(LC2;)Ljava/lang/String;

    move-result-object p0

    invoke-static {v0}, LJ7;->g(LC2;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_5

    const/4 p0, 0x0

    return p0

    :cond_5
    :goto_0
    return v1
.end method

.method public static g(LC2;)Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, LC2;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    const-wide v0, -0xf8f3fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    iget-object v0, p0, LC2;->e:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_1

    sget-object v1, LJ7;->c:Ljava/util/Set;

    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v1, -0xf8fafffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, LC2;->f:Ljava/lang/Object;

    check-cast p0, Ljava/lang/Long;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    iget-object p0, p0, LC2;->c:Ljava/lang/Object;

    check-cast p0, Ljava/lang/String;

    if-nez p0, :cond_2

    const-wide v0, -0xf882fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    const-wide v0, -0xf88cfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x6

    const/4 v2, 0x0

    invoke-static {p0, v0, v2, v2, v1}, Ltz;->R(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    move-result v0

    const/4 v1, 0x1

    if-gt v1, v0, :cond_3

    const/16 v1, 0x41

    if-ge v0, v1, :cond_3

    invoke-virtual {p0, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    const-wide v0, -0xf88ffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, LJ7;->d:LMv;

    iget-object v0, v0, LMv;->a:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_3

    return-object p0

    :cond_3
    const-wide v0, -0xf89efffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a()V
    .locals 4

    invoke-static {}, LcG;->c()Ljava/lang/reflect/Method;

    move-result-object v0

    new-instance v1, LF7;

    const/4 v2, 0x6

    invoke-direct {v1, v2}, LF7;-><init>(I)V

    const-wide v2, -0x20d95fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    const-wide v2, -0x20d9cfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    new-instance v2, LiG;

    invoke-direct {v2, v0}, LiG;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v2, v1}, LiG;->a(Lfj;)V

    return-void
.end method

.method public final b()Ljava/lang/String;
    .locals 2

    const-wide v0, -0xf83bfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
