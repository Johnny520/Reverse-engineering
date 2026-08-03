.class final Lcom/tendcloud/tenddata/bn$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tendcloud/tenddata/bn;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation


# instance fields
.field private pageName:Ljava/lang/String;

.field private refer:Ljava/lang/String;

.field private startTime:J

.field public final synthetic this$0:Lcom/tendcloud/tenddata/bn;


# direct methods
.method private constructor <init>(Lcom/tendcloud/tenddata/bn;JLjava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/tendcloud/tenddata/bn$a;->this$0:Lcom/tendcloud/tenddata/bn;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p2, p0, Lcom/tendcloud/tenddata/bn$a;->startTime:J

    iput-object p4, p0, Lcom/tendcloud/tenddata/bn$a;->refer:Ljava/lang/String;

    iput-object p5, p0, Lcom/tendcloud/tenddata/bn$a;->pageName:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/tendcloud/tenddata/bn;JLjava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/bn$1;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lcom/tendcloud/tenddata/bn$a;-><init>(Lcom/tendcloud/tenddata/bn;JLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic access$100(Lcom/tendcloud/tenddata/bn$a;)J
    .locals 2

    iget-wide v0, p0, Lcom/tendcloud/tenddata/bn$a;->startTime:J

    return-wide v0
.end method

.method public static synthetic access$200(Lcom/tendcloud/tenddata/bn$a;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/tendcloud/tenddata/bn$a;->pageName:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic access$300(Lcom/tendcloud/tenddata/bn$a;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/tendcloud/tenddata/bn$a;->refer:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic access$400(Lcom/tendcloud/tenddata/bn$a;)J
    .locals 2

    invoke-direct {p0}, Lcom/tendcloud/tenddata/bn$a;->getStartTime()J

    move-result-wide v0

    return-wide v0
.end method

.method public static synthetic access$500(Lcom/tendcloud/tenddata/bn$a;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0}, Lcom/tendcloud/tenddata/bn$a;->getRefer()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private getPageName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/tendcloud/tenddata/bn$a;->pageName:Ljava/lang/String;

    return-object v0
.end method

.method private getRefer()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/tendcloud/tenddata/bn$a;->refer:Ljava/lang/String;

    return-object v0
.end method

.method private getStartTime()J
    .locals 2

    iget-wide v0, p0, Lcom/tendcloud/tenddata/bn$a;->startTime:J

    return-wide v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    const-string v0, "pageName: "

    .line 2
    .line 3
    invoke-static {v0}, L۟/c4;->ۥ۟ۤ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/tendcloud/tenddata/bn$a;->pageName:Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    const-string v1, "\nfrom: "

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Lcom/tendcloud/tenddata/bn$a;->refer:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string v1, "\nstartTime: "

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    iget-wide v1, p0, Lcom/tendcloud/tenddata/bn$a;->startTime:J

    .line 28
    .line 29
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    return-object v0
.end method
