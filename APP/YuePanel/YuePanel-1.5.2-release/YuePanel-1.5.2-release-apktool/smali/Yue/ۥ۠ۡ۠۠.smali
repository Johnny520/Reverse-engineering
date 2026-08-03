.class public final LYue/ۥ۠ۡ۠۠;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۠ۡ۠۠$ۥ;
    }
.end annotation


# static fields
.field public static final ۥ:Ljava/lang/String; = "unknown"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ(Ljava/io/File;)Ljava/lang/String;
    .locals 0
    .param p0    # Ljava/io/File;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    invoke-static {p0}, LYue/ۥ۠ۡ۠۠$ۥ;->ۥ(Ljava/io/File;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
