.class public final LYue/ۥۡۢ۠ۧ;
.super LYue/ۥۡۧۤۨ;
.source "SourceFile"


# static fields
.field public static final ۥ:LYue/ۥۡۢ۠ۧ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LYue/ۥۡۢ۠ۧ;

    invoke-direct {v0}, LYue/ۥۡۢ۠ۧ;-><init>()V

    sput-object v0, LYue/ۥۡۢ۠ۧ;->ۥ:LYue/ۥۡۢ۠ۧ;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LYue/ۥۡۧۤۨ;-><init>()V

    return-void
.end method


# virtual methods
.method public ۥ()J
    .locals 2

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    return-wide v0
.end method
