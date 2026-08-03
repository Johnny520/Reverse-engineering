.class public LYue/ۥۣۣۢ۟$ۥ۟۟۟;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۣۣۢ۟;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u06e5\u06df\u06df\u06df"
.end annotation


# instance fields
.field public ۥ:I

.field public ۥ۟:Ljava/lang/String;

.field public final synthetic ۥ۟۟:LYue/ۥۣۣۢ۟;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x12

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>(LYue/ۥۣۣۢ۟;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            null
        }
    .end annotation

    iput-object p1, p0, LYue/ۥۣۣۢ۟$ۥ۟۟۟;->ۥ۟۟:LYue/ۥۣۣۢ۟;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public native ۥ()I
.end method

.method public native ۥ۟()Ljava/lang/String;
.end method

.method public native ۥ۟۟(I)V
.end method

.method public native ۥ۟۟۟(Ljava/lang/String;)V
.end method
