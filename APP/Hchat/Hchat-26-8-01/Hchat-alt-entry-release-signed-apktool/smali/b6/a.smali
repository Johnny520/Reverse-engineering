.class public final Lb6/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lw5/a;


# static fields
.field public static final h:Lb6/a;

.field public static final i:Lb6/a;


# instance fields
.field public final g:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lb6/a;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lb6/a;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lb6/a;->h:Lb6/a;

    .line 8
    .line 9
    new-instance v0, Lb6/a;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-direct {v0, v1}, Lb6/a;-><init>(Z)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lb6/a;->i:Lb6/a;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lb6/a;->g:Z

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 2

    .line 1
    check-cast p1, Lw5/a;

    .line 2
    .line 3
    const/16 v0, 0x1f

    .line 4
    .line 5
    invoke-interface {p1}, Lw5/a;->h()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {v0, v1}, Ljava/lang/Integer;->compare(II)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    return v0

    .line 16
    :cond_0
    check-cast p1, Lb6/a;

    .line 17
    .line 18
    iget-boolean p1, p1, Lb6/a;->g:Z

    .line 19
    .line 20
    iget-boolean v0, p0, Lb6/a;->g:Z

    .line 21
    .line 22
    invoke-static {v0, p1}, Ljava/lang/Boolean;->compare(ZZ)I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lb6/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lb6/a;

    .line 6
    .line 7
    iget-boolean p1, p1, Lb6/a;->g:Z

    .line 8
    .line 9
    iget-boolean v0, p0, Lb6/a;->g:Z

    .line 10
    .line 11
    if-ne v0, p1, :cond_0

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    return p1

    .line 15
    :cond_0
    const/4 p1, 0x0

    .line 16
    return p1
.end method

.method public final h()I
    .locals 1

    .line 1
    const/16 v0, 0x1f

    .line 2
    .line 3
    return v0
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-boolean v0, p0, Lb6/a;->g:Z

    .line 2
    .line 3
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/io/StringWriter;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    new-instance v1, Lq5/a;

    .line 7
    .line 8
    invoke-direct {v1, v0}, Lq5/a;-><init>(Ljava/io/Writer;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1, p0}, Lq5/a;->g(Lw5/a;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    return-object v0

    .line 19
    :catch_0
    const-string v0, "Unexpected IOException"

    .line 20
    .line 21
    invoke-static {v0}, Lj8/o;->f(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    return-object v0
.end method
