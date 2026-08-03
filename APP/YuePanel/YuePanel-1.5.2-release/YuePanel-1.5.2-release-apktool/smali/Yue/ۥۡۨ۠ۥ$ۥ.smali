.class public LYue/ۥۡۨ۠ۥ$ۥ;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۨ۠ۥ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5"
.end annotation


# instance fields
.field public ۥ:Z

.field public ۥ۟:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x5d

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public native ۥ()Ljava/lang/String;
.end method

.method public native ۥ۟()Z
.end method

.method public native ۥ۟۟(Ljava/lang/String;)V
.end method

.method public native ۥ۟۟۟(Z)V
.end method
