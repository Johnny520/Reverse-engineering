.class public abstract Lc0/L0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const-string v0, "ImgInfo2"

    const-string v1, "voiceinfo"

    const-string v2, "videoinfo2"

    const-string v3, "WxFileIndex2"

    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LE0/m;->h0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lc0/L0;->a:Ljava/util/List;

    return-void
.end method
