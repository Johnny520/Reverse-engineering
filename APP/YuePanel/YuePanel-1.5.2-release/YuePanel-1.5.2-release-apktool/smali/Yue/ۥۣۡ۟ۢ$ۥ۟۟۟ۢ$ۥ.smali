.class public LYue/ۥۣۡ۟ۢ$ۥ۟۟۟ۢ$ۥ;
.super LYue/ۥ۠ۢۧ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۣۡ۟ۢ$ۥ۟۟۟ۢ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5"
.end annotation


# instance fields
.field public final ۥ۟۟۠ۤ:LYue/ۥۣۡ۟ۢ$ۥۣ۟۟۟;

.field public final ۥ۟۟۠ۥ:J

.field public ۥ۟۟۠ۦ:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x26d

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>(LYue/ۥۣۣ۟۟;LYue/ۥۣۡ۟ۢ$ۥۣ۟۟۟;J)V
    .locals 2

    invoke-direct {p0, p1}, LYue/ۥ۠ۢۧ;-><init>(LYue/ۥۣۢ۟ۡ;)V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, LYue/ۥۣۡ۟ۢ$ۥ۟۟۟ۢ$ۥ;->ۥ۟۟۠ۦ:J

    iput-object p2, p0, LYue/ۥۣۡ۟ۢ$ۥ۟۟۟ۢ$ۥ;->ۥ۟۟۠ۤ:LYue/ۥۣۡ۟ۢ$ۥۣ۟۟۟;

    iput-wide p3, p0, LYue/ۥۣۡ۟ۢ$ۥ۟۟۟ۢ$ۥ;->ۥ۟۟۠ۥ:J

    return-void
.end method

.method public static native synthetic ۥ۟۟۟(LYue/ۥۣۡ۟ۢ$ۥ۟۟۟ۢ$ۥ;I)V
.end method


# virtual methods
.method public final native synthetic ۥ۟۟۟۟(I)V
.end method

.method public native ۥ۟۟۟ۦ(LYue/ۥۣ۟ۢۨ;J)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method
