.class public final Ll7/e;
.super Ll7/f;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic r:Ll7/l;


# direct methods
.method public constructor <init>(Ll7/l;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ll7/e;->r:Ll7/l;

    .line 2
    .line 3
    invoke-direct {p0}, Ll7/f;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final B(Lq7/b;)V
    .locals 1

    .line 1
    new-instance p1, Ljava/io/IOException;

    .line 2
    .line 3
    const-string v0, "Can\'t read on empty package"

    .line 4
    .line 5
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p1
.end method

.method public final C(Ljava/io/ByteArrayOutputStream;)I
    .locals 1

    .line 1
    new-instance p1, Ljava/io/IOException;

    .line 2
    .line 3
    const-string v0, "Can\'t write on empty package"

    .line 4
    .line 5
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p1
.end method

.method public final U()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final V()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "empty-package"

    .line 2
    .line 3
    return-object v0
.end method

.method public final Y()Ll7/l;
    .locals 1

    .line 1
    iget-object v0, p0, Ll7/e;->r:Ll7/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public final a()Lu7/c;
    .locals 1

    .line 1
    iget-object v0, p0, Ll7/f;->p:Lu7/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 1
    check-cast p1, Ll7/f;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p1}, Ll7/f;->U()I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    invoke-static {v0, p1}, Ljava/lang/Integer;->compare(II)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1
.end method

.method public final isEmpty()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public final p()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final r()[B
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [B

    .line 3
    .line 4
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "empty-package"

    .line 2
    .line 3
    return-object v0
.end method

.method public final y()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method
