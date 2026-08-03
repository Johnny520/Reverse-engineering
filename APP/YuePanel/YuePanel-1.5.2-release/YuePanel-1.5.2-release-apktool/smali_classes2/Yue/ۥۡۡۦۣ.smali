.class public final LYue/ۥۡۡۦۣ;
.super LYue/ۥۡۦۥ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۡۡۦۣ$ۥ;,
        LYue/ۥۡۡۦۣ$ۥ۟;,
        LYue/ۥۡۡۦۣ$ۥ۟۟;
    }
.end annotation


# static fields
.field public static final ۥ۟۟۟ۡ:LYue/ۥۡۡۦۣ$ۥ۟;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟۟۟ۢ:LYue/ۥۡ۠ۥۨ;
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥۣ۟۟۟:LYue/ۥۡ۠ۥۨ;
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟۟۟ۤ:LYue/ۥۡ۠ۥۨ;
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟۟۟ۥ:LYue/ۥۡ۠ۥۨ;
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟۟۟ۦ:LYue/ۥۡ۠ۥۨ;
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟۟۟ۧ:[B
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟۟۟ۨ:[B
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟۟۠:[B
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# instance fields
.field public final ۥ۟:LYue/ۥۣ۟ۥۤ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟۟:LYue/ۥۡ۠ۥۨ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟۟۟:Ljava/util/List;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LYue/\u06e5\u06e1\u06e1\u06e6\u06e3$\u06e5\u06df\u06df;",
            ">;"
        }
    .end annotation
.end field

.field public final ۥ۟۟۟۟:LYue/ۥۡ۠ۥۨ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public ۥ۟۟۟۠:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LYue/ۥۡۡۦۣ$ۥ۟;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LYue/ۥۡۡۦۣ$ۥ۟;-><init>(LYue/ۥ۟ۨۥۢ;)V

    sput-object v0, LYue/ۥۡۡۦۣ;->ۥ۟۟۟ۡ:LYue/ۥۡۡۦۣ$ۥ۟;

    sget-object v0, LYue/ۥۡ۠ۥۨ;->ۥ۟۟۟۟:LYue/ۥۡ۠ۥۨ$ۥ;

    const-string v1, "multipart/mixed"

    invoke-virtual {v0, v1}, LYue/ۥۡ۠ۥۨ$ۥ;->ۥ۟۟(Ljava/lang/String;)LYue/ۥۡ۠ۥۨ;

    move-result-object v1

    sput-object v1, LYue/ۥۡۡۦۣ;->ۥ۟۟۟ۢ:LYue/ۥۡ۠ۥۨ;

    const-string v1, "multipart/alternative"

    invoke-virtual {v0, v1}, LYue/ۥۡ۠ۥۨ$ۥ;->ۥ۟۟(Ljava/lang/String;)LYue/ۥۡ۠ۥۨ;

    move-result-object v1

    sput-object v1, LYue/ۥۡۡۦۣ;->ۥۣ۟۟۟:LYue/ۥۡ۠ۥۨ;

    const-string v1, "multipart/digest"

    invoke-virtual {v0, v1}, LYue/ۥۡ۠ۥۨ$ۥ;->ۥ۟۟(Ljava/lang/String;)LYue/ۥۡ۠ۥۨ;

    move-result-object v1

    sput-object v1, LYue/ۥۡۡۦۣ;->ۥ۟۟۟ۤ:LYue/ۥۡ۠ۥۨ;

    const-string v1, "multipart/parallel"

    invoke-virtual {v0, v1}, LYue/ۥۡ۠ۥۨ$ۥ;->ۥ۟۟(Ljava/lang/String;)LYue/ۥۡ۠ۥۨ;

    move-result-object v1

    sput-object v1, LYue/ۥۡۡۦۣ;->ۥ۟۟۟ۥ:LYue/ۥۡ۠ۥۨ;

    const-string v1, "multipart/form-data"

    invoke-virtual {v0, v1}, LYue/ۥۡ۠ۥۨ$ۥ;->ۥ۟۟(Ljava/lang/String;)LYue/ۥۡ۠ۥۨ;

    move-result-object v0

    sput-object v0, LYue/ۥۡۡۦۣ;->ۥ۟۟۟ۦ:LYue/ۥۡ۠ۥۨ;

    const/4 v0, 0x2

    new-array v1, v0, [B

    fill-array-data v1, :array_0

    sput-object v1, LYue/ۥۡۡۦۣ;->ۥ۟۟۟ۧ:[B

    new-array v1, v0, [B

    fill-array-data v1, :array_1

    sput-object v1, LYue/ۥۡۡۦۣ;->ۥ۟۟۟ۨ:[B

    new-array v0, v0, [B

    fill-array-data v0, :array_2

    sput-object v0, LYue/ۥۡۡۦۣ;->ۥ۟۟۠:[B

    return-void

    nop

    :array_0
    .array-data 1
        0x3at
        0x20t
    .end array-data

    nop

    :array_1
    .array-data 1
        0xdt
        0xat
    .end array-data

    nop

    :array_2
    .array-data 1
        0x2dt
        0x2dt
    .end array-data
.end method

.method public constructor <init>(LYue/ۥۣ۟ۥۤ;LYue/ۥۡ۠ۥۨ;Ljava/util/List;)V
    .locals 1
    .param p1    # LYue/ۥۣ۟ۥۤ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۡ۠ۥۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # Ljava/util/List;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e3\u06e5\u06e4;",
            "LYue/\u06e5\u06e1\u06e0\u06e5\u06e8;",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e1\u06e1\u06e6\u06e3$\u06e5\u06df\u06df;",
            ">;)V"
        }
    .end annotation

    const-string v0, "boundaryByteString"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parts"

    invoke-static {p3, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LYue/ۥۡۦۥ;-><init>()V

    iput-object p1, p0, LYue/ۥۡۡۦۣ;->ۥ۟:LYue/ۥۣ۟ۥۤ;

    iput-object p2, p0, LYue/ۥۡۡۦۣ;->ۥ۟۟:LYue/ۥۡ۠ۥۨ;

    iput-object p3, p0, LYue/ۥۡۡۦۣ;->ۥ۟۟۟:Ljava/util/List;

    sget-object p1, LYue/ۥۡ۠ۥۨ;->ۥ۟۟۟۟:LYue/ۥۡ۠ۥۨ$ۥ;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, "; boundary="

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LYue/ۥۡۡۦۣ;->ۥ۟۟۠ۦ()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, LYue/ۥۡ۠ۥۨ$ۥ;->ۥ۟۟(Ljava/lang/String;)LYue/ۥۡ۠ۥۨ;

    move-result-object p1

    iput-object p1, p0, LYue/ۥۡۡۦۣ;->ۥ۟۟۟۟:LYue/ۥۡ۠ۥۨ;

    const-wide/16 p1, -0x1

    iput-wide p1, p0, LYue/ۥۡۡۦۣ;->ۥ۟۟۟۠:J

    return-void
.end method

.method private final ۥ۟۟ۡ۠(LYue/ۥۣۣ۟۟;Z)J
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-eqz p2, :cond_0

    new-instance p1, LYue/ۥۣ۟ۢۨ;

    invoke-direct {p1}, LYue/ۥۣ۟ۢۨ;-><init>()V

    move-object v0, p1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, LYue/ۥۡۡۦۣ;->ۥ۟۟۟:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    move v5, v2

    :goto_1
    if-ge v5, v1, :cond_6

    iget-object v6, p0, LYue/ۥۡۡۦۣ;->ۥ۟۟۟:Ljava/util/List;

    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LYue/ۥۡۡۦۣ$ۥ۟۟;

    invoke-virtual {v6}, LYue/ۥۡۡۦۣ$ۥ۟۟;->ۥ۟۟۟ۢ()LYue/ۥ۠ۤۢۢ;

    move-result-object v7

    invoke-virtual {v6}, LYue/ۥۡۡۦۣ$ۥ۟۟;->ۥ۟۟()LYue/ۥۡۦۥ;

    move-result-object v6

    invoke-static {p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    sget-object v8, LYue/ۥۡۡۦۣ;->ۥ۟۟۠:[B

    invoke-interface {p1, v8}, LYue/ۥۣۣ۟۟;->write([B)LYue/ۥۣۣ۟۟;

    iget-object v8, p0, LYue/ۥۡۡۦۣ;->ۥ۟:LYue/ۥۣ۟ۥۤ;

    invoke-interface {p1, v8}, LYue/ۥۣۣ۟۟;->ۥ۟۟ۦۣ(LYue/ۥۣ۟ۥۤ;)LYue/ۥۣۣ۟۟;

    sget-object v8, LYue/ۥۡۡۦۣ;->ۥ۟۟۟ۨ:[B

    invoke-interface {p1, v8}, LYue/ۥۣۣ۟۟;->write([B)LYue/ۥۣۣ۟۟;

    if-eqz v7, :cond_1

    invoke-virtual {v7}, LYue/ۥ۠ۤۢۢ;->size()I

    move-result v8

    move v9, v2

    :goto_2
    if-ge v9, v8, :cond_1

    invoke-virtual {v7, v9}, LYue/ۥ۠ۤۢۢ;->ۥ۟۟۟۠(I)Ljava/lang/String;

    move-result-object v10

    invoke-interface {p1, v10}, LYue/ۥۣۣ۟۟;->ۥۣ۟۟ۡ(Ljava/lang/String;)LYue/ۥۣۣ۟۟;

    move-result-object v10

    sget-object v11, LYue/ۥۡۡۦۣ;->ۥ۟۟۟ۧ:[B

    invoke-interface {v10, v11}, LYue/ۥۣۣ۟۟;->write([B)LYue/ۥۣۣ۟۟;

    move-result-object v10

    invoke-virtual {v7, v9}, LYue/ۥ۠ۤۢۢ;->ۥ۟۟۟ۧ(I)Ljava/lang/String;

    move-result-object v11

    invoke-interface {v10, v11}, LYue/ۥۣۣ۟۟;->ۥۣ۟۟ۡ(Ljava/lang/String;)LYue/ۥۣۣ۟۟;

    move-result-object v10

    sget-object v11, LYue/ۥۡۡۦۣ;->ۥ۟۟۟ۨ:[B

    invoke-interface {v10, v11}, LYue/ۥۣۣ۟۟;->write([B)LYue/ۥۣۣ۟۟;

    add-int/lit8 v9, v9, 0x1

    goto :goto_2

    :cond_1
    invoke-virtual {v6}, LYue/ۥۡۦۥ;->ۥ۟()LYue/ۥۡ۠ۥۨ;

    move-result-object v7

    if-eqz v7, :cond_2

    const-string v8, "Content-Type: "

    invoke-interface {p1, v8}, LYue/ۥۣۣ۟۟;->ۥۣ۟۟ۡ(Ljava/lang/String;)LYue/ۥۣۣ۟۟;

    move-result-object v8

    invoke-virtual {v7}, LYue/ۥۡ۠ۥۨ;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v8, v7}, LYue/ۥۣۣ۟۟;->ۥۣ۟۟ۡ(Ljava/lang/String;)LYue/ۥۣۣ۟۟;

    move-result-object v7

    sget-object v8, LYue/ۥۡۡۦۣ;->ۥ۟۟۟ۨ:[B

    invoke-interface {v7, v8}, LYue/ۥۣۣ۟۟;->write([B)LYue/ۥۣۣ۟۟;

    :cond_2
    invoke-virtual {v6}, LYue/ۥۡۦۥ;->ۥ()J

    move-result-wide v7

    const-wide/16 v9, -0x1

    cmp-long v11, v7, v9

    if-eqz v11, :cond_3

    const-string v9, "Content-Length: "

    invoke-interface {p1, v9}, LYue/ۥۣۣ۟۟;->ۥۣ۟۟ۡ(Ljava/lang/String;)LYue/ۥۣۣ۟۟;

    move-result-object v9

    invoke-interface {v9, v7, v8}, LYue/ۥۣۣ۟۟;->ۥ۟۟ۦۦ(J)LYue/ۥۣۣ۟۟;

    move-result-object v9

    sget-object v10, LYue/ۥۡۡۦۣ;->ۥ۟۟۟ۨ:[B

    invoke-interface {v9, v10}, LYue/ۥۣۣ۟۟;->write([B)LYue/ۥۣۣ۟۟;

    goto :goto_3

    :cond_3
    if-eqz p2, :cond_4

    invoke-static {v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    invoke-virtual {v0}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟۟۟()V

    return-wide v9

    :cond_4
    :goto_3
    sget-object v9, LYue/ۥۡۡۦۣ;->ۥ۟۟۟ۨ:[B

    invoke-interface {p1, v9}, LYue/ۥۣۣ۟۟;->write([B)LYue/ۥۣۣ۟۟;

    if-eqz p2, :cond_5

    add-long/2addr v3, v7

    goto :goto_4

    :cond_5
    invoke-virtual {v6, p1}, LYue/ۥۡۦۥ;->ۥ۟۟۠ۡ(LYue/ۥۣۣ۟۟;)V

    :goto_4
    invoke-interface {p1, v9}, LYue/ۥۣۣ۟۟;->write([B)LYue/ۥۣۣ۟۟;

    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_1

    :cond_6
    invoke-static {p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    sget-object v1, LYue/ۥۡۡۦۣ;->ۥ۟۟۠:[B

    invoke-interface {p1, v1}, LYue/ۥۣۣ۟۟;->write([B)LYue/ۥۣۣ۟۟;

    iget-object v2, p0, LYue/ۥۡۡۦۣ;->ۥ۟:LYue/ۥۣ۟ۥۤ;

    invoke-interface {p1, v2}, LYue/ۥۣۣ۟۟;->ۥ۟۟ۦۣ(LYue/ۥۣ۟ۥۤ;)LYue/ۥۣۣ۟۟;

    invoke-interface {p1, v1}, LYue/ۥۣۣ۟۟;->write([B)LYue/ۥۣۣ۟۟;

    sget-object v1, LYue/ۥۡۡۦۣ;->ۥ۟۟۟ۨ:[B

    invoke-interface {p1, v1}, LYue/ۥۣۣ۟۟;->write([B)LYue/ۥۣۣ۟۟;

    if-eqz p2, :cond_7

    invoke-static {v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    invoke-virtual {v0}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨ()J

    move-result-wide p1

    add-long/2addr v3, p1

    invoke-virtual {v0}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟۟۟()V

    :cond_7
    return-wide v3
.end method


# virtual methods
.method public ۥ()J
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-wide v0, p0, LYue/ۥۡۡۦۣ;->ۥ۟۟۟۠:J

    const-wide/16 v2, -0x1

    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, LYue/ۥۡۡۦۣ;->ۥ۟۟ۡ۠(LYue/ۥۣۣ۟۟;Z)J

    move-result-wide v0

    iput-wide v0, p0, LYue/ۥۡۡۦۣ;->ۥ۟۟۟۠:J

    :cond_0
    return-wide v0
.end method

.method public ۥ۟()LYue/ۥۡ۠ۥۨ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۡۦۣ;->ۥ۟۟۟۟:LYue/ۥۡ۠ۥۨ;

    return-object v0
.end method

.method public ۥ۟۟۠ۡ(LYue/ۥۣۣ۟۟;)V
    .locals 1
    .param p1    # LYue/ۥۣۣ۟۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "sink"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, LYue/ۥۡۡۦۣ;->ۥ۟۟ۡ۠(LYue/ۥۣۣ۟۟;Z)J

    return-void
.end method

.method public final ۥ۟۟۠ۢ()Ljava/lang/String;
    .locals 1
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "moved to val"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "boundary"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "-deprecated_boundary"
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    invoke-virtual {p0}, LYue/ۥۡۡۦۣ;->ۥ۟۟۠ۦ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۥۣ۟۟۠()Ljava/util/List;
    .locals 1
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "moved to val"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "parts"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "-deprecated_parts"
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e1\u06e1\u06e6\u06e3$\u06e5\u06df\u06df;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۡۡۦۣ;->ۥ۟۟۟:Ljava/util/List;

    return-object v0
.end method

.method public final ۥ۟۟۠ۤ()I
    .locals 1
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "moved to val"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "size"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "-deprecated_size"
    .end annotation

    invoke-virtual {p0}, LYue/ۥۡۡۦۣ;->ۥ۟۟ۡ()I

    move-result v0

    return v0
.end method

.method public final ۥ۟۟۠ۥ()LYue/ۥۡ۠ۥۨ;
    .locals 1
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "moved to val"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "type"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "-deprecated_type"
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۡۦۣ;->ۥ۟۟:LYue/ۥۡ۠ۥۨ;

    return-object v0
.end method

.method public final ۥ۟۟۠ۦ()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "boundary"
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۡۦۣ;->ۥ۟:LYue/ۥۣ۟ۥۤ;

    invoke-virtual {v0}, LYue/ۥۣ۟ۥۤ;->ۥ۟۟ۥۡ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۥ۟۟۠ۧ(I)LYue/ۥۡۡۦۣ$ۥ۟۟;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۡۦۣ;->ۥ۟۟۟:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LYue/ۥۡۡۦۣ$ۥ۟۟;

    return-object p1
.end method

.method public final ۥ۟۟۠ۨ()Ljava/util/List;
    .locals 1
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "parts"
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e1\u06e1\u06e6\u06e3$\u06e5\u06df\u06df;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۡۡۦۣ;->ۥ۟۟۟:Ljava/util/List;

    return-object v0
.end method

.method public final ۥ۟۟ۡ()I
    .locals 1
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "size"
    .end annotation

    iget-object v0, p0, LYue/ۥۡۡۦۣ;->ۥ۟۟۟:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final ۥ۟۟ۡ۟()LYue/ۥۡ۠ۥۨ;
    .locals 1
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "type"
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۡۦۣ;->ۥ۟۟:LYue/ۥۡ۠ۥۨ;

    return-object v0
.end method
