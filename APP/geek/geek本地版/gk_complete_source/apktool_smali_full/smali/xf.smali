.class public final Lxf;
.super Lv10;


# static fields
.field public static final d:Lxf;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lxf;

    .line 2
    .line 3
    sget v2, Lx50;->c:I

    .line 4
    .line 5
    sget v3, Lx50;->d:I

    .line 6
    .line 7
    sget-wide v4, Lx50;->e:J

    .line 8
    .line 9
    sget-object v6, Lx50;->a:Ljava/lang/String;

    .line 10
    .line 11
    invoke-direct {v0}, Lke;-><init>()V

    .line 12
    .line 13
    .line 14
    new-instance v1, Lne;

    .line 15
    .line 16
    invoke-direct/range {v1 .. v6}, Lne;-><init>(IIJLjava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iput-object v1, v0, Lv10;->c:Lne;

    .line 20
    .line 21
    sput-object v0, Lxf;->d:Lxf;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v1, "Dispatchers.Default cannot be closed"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "Dispatchers.Default"

    .line 2
    .line 3
    return-object v0
.end method
