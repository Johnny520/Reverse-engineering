.class public LYue/ۥۡۧ۟ۦ$ۥ۟۟۟;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۧ۟ۦ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u06e5\u06df\u06df\u06df"
.end annotation


# instance fields
.field public ۥ:Ljava/lang/String;

.field public ۥ۟:Ljava/lang/String;

.field public ۥ۟۟:Ljava/lang/String;

.field public ۥ۟۟۟:I

.field public final synthetic ۥ۟۟۟۟:LYue/ۥۡۧ۟ۦ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x2d4

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>(LYue/ۥۡۧ۟ۦ;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            null
        }
    .end annotation

    .line 1
    iput-object p1, p0, LYue/ۥۡۧ۟ۦ$ۥ۟۟۟;->ۥ۟۟۟۟:LYue/ۥۡۧ۟ۦ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(LYue/ۥۡۧ۟ۦ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010,
            0x0,
            0x0,
            0x0,
            0x0
        }
        names = {
            null,
            null,
            null,
            null,
            null
        }
    .end annotation

    .line 2
    iput-object p1, p0, LYue/ۥۡۧ۟ۦ$ۥ۟۟۟;->ۥ۟۟۟۟:LYue/ۥۡۧ۟ۦ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p2, p0, LYue/ۥۡۧ۟ۦ$ۥ۟۟۟;->ۥ:Ljava/lang/String;

    .line 4
    iput-object p3, p0, LYue/ۥۡۧ۟ۦ$ۥ۟۟۟;->ۥ۟:Ljava/lang/String;

    .line 5
    iput-object p4, p0, LYue/ۥۡۧ۟ۦ$ۥ۟۟۟;->ۥ۟۟:Ljava/lang/String;

    .line 6
    iput p5, p0, LYue/ۥۡۧ۟ۦ$ۥ۟۟۟;->ۥ۟۟۟:I

    return-void
.end method


# virtual methods
.method public native ۥ()Ljava/lang/String;
.end method

.method public native ۥ۟()Ljava/lang/String;
.end method

.method public native ۥ۟۟()Ljava/lang/String;
.end method

.method public native ۥ۟۟۟()I
.end method

.method public native ۥ۟۟۟۟(Ljava/lang/String;)V
.end method

.method public native ۥ۟۟۟۠(Ljava/lang/String;)V
.end method

.method public native ۥ۟۟۟ۡ(Ljava/lang/String;)V
.end method

.method public native ۥ۟۟۟ۢ(I)V
.end method
