.class public final enum Lcom/tendcloud/tenddata/aq;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/tendcloud/tenddata/aq;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/tendcloud/tenddata/aq;

.field public static final enum b:Lcom/tendcloud/tenddata/aq;

.field private static final synthetic d:[Lcom/tendcloud/tenddata/aq;


# instance fields
.field private final c:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/tendcloud/tenddata/aq;

    const-string v1, "GET"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/tendcloud/tenddata/aq;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lcom/tendcloud/tenddata/aq;->a:Lcom/tendcloud/tenddata/aq;

    new-instance v1, Lcom/tendcloud/tenddata/aq;

    const-string v3, "POST"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Lcom/tendcloud/tenddata/aq;-><init>(Ljava/lang/String;IZ)V

    sput-object v1, Lcom/tendcloud/tenddata/aq;->b:Lcom/tendcloud/tenddata/aq;

    const/4 v3, 0x2

    new-array v3, v3, [Lcom/tendcloud/tenddata/aq;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, Lcom/tendcloud/tenddata/aq;->d:[Lcom/tendcloud/tenddata/aq;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-boolean p3, p0, Lcom/tendcloud/tenddata/aq;->c:Z

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/tendcloud/tenddata/aq;
    .locals 1

    const-class v0, Lcom/tendcloud/tenddata/aq;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/tendcloud/tenddata/aq;

    return-object p0
.end method

.method public static values()[Lcom/tendcloud/tenddata/aq;
    .locals 1

    sget-object v0, Lcom/tendcloud/tenddata/aq;->d:[Lcom/tendcloud/tenddata/aq;

    invoke-virtual {v0}, [Lcom/tendcloud/tenddata/aq;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/tendcloud/tenddata/aq;

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/net/HttpURLConnection;)V
    .locals 1

    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/tendcloud/tenddata/aq;->c:Z

    invoke-virtual {p1, v0}, Ljava/net/URLConnection;->setDoOutput(Z)V

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/net/URLConnection;->setDoInput(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method
