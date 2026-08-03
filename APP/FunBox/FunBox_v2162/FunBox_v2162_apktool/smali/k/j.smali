.class public final Lk/j;
.super Lk/l;
.source "SourceFile"


# static fields
.field private static final b:[Lk/j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x1ff

    new-array v0, v0, [Lk/j;

    sput-object v0, Lk/j;->b:[Lk/j;

    const/4 v0, -0x1

    invoke-static {v0}, Lk/j;->j(I)Lk/j;

    const/4 v0, 0x0

    invoke-static {v0}, Lk/j;->j(I)Lk/j;

    const/4 v0, 0x1

    invoke-static {v0}, Lk/j;->j(I)Lk/j;

    const/4 v0, 0x2

    invoke-static {v0}, Lk/j;->j(I)Lk/j;

    const/4 v0, 0x3

    invoke-static {v0}, Lk/j;->j(I)Lk/j;

    const/4 v0, 0x4

    invoke-static {v0}, Lk/j;->j(I)Lk/j;

    const/4 v0, 0x5

    invoke-static {v0}, Lk/j;->j(I)Lk/j;

    return-void
.end method

.method public static j(I)Lk/j;
    .locals 4

    const v0, 0x7fffffff

    and-int/2addr v0, p0

    sget-object v1, Lk/j;->b:[Lk/j;

    array-length v2, v1

    rem-int/2addr v0, v2

    aget-object v2, v1, v0

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lk/l;->h()I

    move-result v3

    if-ne v3, p0, :cond_0

    return-object v2

    :cond_0
    new-instance v2, Lk/j;

    invoke-direct {v2, p0}, Lk/j;-><init>(I)V

    aput-object v2, v1, v0

    return-object v2
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lk/l;->h()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final c()Ll/c;
    .locals 1

    sget-object v0, Ll/c;->l:Ll/c;

    return-object v0
.end method

.method public final f()Ljava/lang/String;
    .locals 1

    const-string v0, "int"

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Lk/l;->h()I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "int{0x"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, La/b;->s(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " / "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v0, 0x7d

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
