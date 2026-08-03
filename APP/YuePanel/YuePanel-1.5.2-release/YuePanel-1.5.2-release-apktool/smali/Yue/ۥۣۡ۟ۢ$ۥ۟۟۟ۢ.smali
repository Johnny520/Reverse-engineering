.class public LYue/ۥۣۡ۟ۢ$ۥ۟۟۟ۢ;
.super LYue/ۥۡۦۥ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۣۡ۟ۢ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df\u06df\u06e2"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۣۡ۟ۢ$ۥ۟۟۟ۢ$ۥ;
    }
.end annotation


# instance fields
.field public final ۥ۟:LYue/ۥۡۦۥ;

.field public final ۥ۟۟:LYue/ۥۣۡ۟ۢ$ۥۣ۟۟۟;

.field public ۥ۟۟۟:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x269

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>(LYue/ۥۡۦۥ;LYue/ۥۣۡ۟ۢ$ۥۣ۟۟۟;)V
    .locals 0

    invoke-direct {p0}, LYue/ۥۡۦۥ;-><init>()V

    iput-object p1, p0, LYue/ۥۣۡ۟ۢ$ۥ۟۟۟ۢ;->ۥ۟:LYue/ۥۡۦۥ;

    iput-object p2, p0, LYue/ۥۣۡ۟ۢ$ۥ۟۟۟ۢ;->ۥ۟۟:LYue/ۥۣۡ۟ۢ$ۥۣ۟۟۟;

    :try_start_0
    invoke-virtual {p1}, LYue/ۥۡۦۥ;->ۥ()J

    move-result-wide p1

    iput-wide p1, p0, LYue/ۥۣۡ۟ۢ$ۥ۟۟۟ۢ;->ۥ۟۟۟:J
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-wide/16 p1, 0x0

    iput-wide p1, p0, LYue/ۥۣۡ۟ۢ$ۥ۟۟۟ۢ;->ۥ۟۟۟:J

    :goto_0
    return-void
.end method


# virtual methods
.method public native ۥ()J
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public native ۥ۟()LYue/ۥۡ۠ۥۨ;
.end method

.method public native ۥ۟۟۠ۡ(LYue/ۥۣۣ۟۟;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method
