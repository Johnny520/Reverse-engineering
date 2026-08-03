.class public final LYue/ۥۣۢۢۧ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۣۢۢۧ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LYue/ۥ۟ۨۥۢ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LYue/ۥۣۢۢۧ$ۥ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ(JJJ)LYue/ۥۣۢۢۧ;
    .locals 9
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v8, LYue/ۥۣۢۢۧ;

    const/4 v7, 0x0

    move-object v0, v8

    move-wide v1, p1

    move-wide v3, p3

    move-wide v5, p5

    invoke-direct/range {v0 .. v7}, LYue/ۥۣۢۢۧ;-><init>(JJJLYue/ۥ۟ۨۥۢ;)V

    return-object v8
.end method
