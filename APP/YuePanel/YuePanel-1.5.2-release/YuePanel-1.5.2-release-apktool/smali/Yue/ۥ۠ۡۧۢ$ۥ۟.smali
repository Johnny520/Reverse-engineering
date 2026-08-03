.class public LYue/ۥ۠ۡۧۢ$ۥ۟;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۡۧۢ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df"
.end annotation


# instance fields
.field public ۥ:Z

.field public ۥ۟:Z

.field public ۥ۟۟:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x3e3

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>(ZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LYue/ۥ۠ۡۧۢ$ۥ۟;->ۥ:Z

    iput-boolean p2, p0, LYue/ۥ۠ۡۧۢ$ۥ۟;->ۥ۟:Z

    return-void
.end method

.method public static native ۥ()LYue/ۥ۠ۡۧۢ$ۥ۟;
.end method

.method public static native ۥ۟()LYue/ۥ۠ۡۧۢ$ۥ۟;
.end method

.method public static native ۥ۟۟()LYue/ۥ۠ۡۧۢ$ۥ۟;
.end method

.method public static native ۥ۟۟۟()LYue/ۥ۠ۡۧۢ$ۥ۟;
.end method
