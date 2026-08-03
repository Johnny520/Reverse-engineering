.class public final LYue/ۥۢ۠ۧ;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final ۥ:LYue/ۥۢ۠ۧ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟:Ljava/lang/String;
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LYue/ۥۢ۠ۧ;

    invoke-direct {v0}, LYue/ۥۢ۠ۧ;-><init>()V

    sput-object v0, LYue/ۥۢ۠ۧ;->ۥ:LYue/ۥۢ۠ۧ;

    const-string v0, "line.separator"

    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    sput-object v0, LYue/ۥۢ۠ۧ;->ۥ۟:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
