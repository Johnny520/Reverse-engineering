.class public LYue/ۥۡۧۢۧ$ۥ۟۟۟;
.super LYue/ۥۡۧۢۧ$ۥ۟۟۟۟;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۧۢۧ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df\u06df"
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, LYue/ۥۡۧۢۧ$ۥ۟۟۟۟;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public static ۥ(Ljava/lang/String;)LYue/ۥۡۧۢۧ$ۥ۟۟۟;
    .locals 1

    new-instance v0, LYue/ۥۡۧۢۧ$ۥ۟۟۟;

    invoke-static {p0}, LYue/ۥۡۢۤۨ;->ۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, LYue/ۥۡۧۢۧ$ۥ۟۟۟;-><init>(Ljava/lang/String;)V

    return-object v0
.end method
