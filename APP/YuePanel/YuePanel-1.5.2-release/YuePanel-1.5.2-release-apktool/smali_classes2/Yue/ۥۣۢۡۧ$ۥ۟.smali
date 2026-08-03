.class public final LYue/ۥۣۢۡۧ$ۥ۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣۢۡۧ$ۥ۟۟;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۣۢۡۧ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5\u06df"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۣۢۡۧ$ۥ۟$ۥ;
    }
.end annotation


# static fields
.field public static final ۥ۟:LYue/ۥۣۢۡۧ$ۥ۟;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LYue/ۥۣۢۡۧ$ۥ۟;

    invoke-direct {v0}, LYue/ۥۣۢۡۧ$ۥ۟;-><init>()V

    sput-object v0, LYue/ۥۣۢۡۧ$ۥ۟;->ۥ۟:LYue/ۥۣۢۡۧ$ۥ۟;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, LYue/ۥۡۡۤۨ;->ۥ۟:LYue/ۥۡۡۤۨ;

    invoke-virtual {v0}, LYue/ۥۡۡۤۨ;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic ۥ()LYue/ۥ۟ۦۡۦ;
    .locals 2

    .line 1
    invoke-virtual {p0}, LYue/ۥۣۢۡۧ$ۥ۟;->ۥ۟()J

    move-result-wide v0

    invoke-static {v0, v1}, LYue/ۥۣۢۡۧ$ۥ۟$ۥ;->ۥ۟۟۟۠(J)LYue/ۥۣۢۡۧ$ۥ۟$ۥ;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic ۥ()LYue/ۥۣۢۡۦ;
    .locals 2

    .line 2
    invoke-virtual {p0}, LYue/ۥۣۢۡۧ$ۥ۟;->ۥ۟()J

    move-result-wide v0

    invoke-static {v0, v1}, LYue/ۥۣۢۡۧ$ۥ۟$ۥ;->ۥ۟۟۟۠(J)LYue/ۥۣۢۡۧ$ۥ۟$ۥ;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟()J
    .locals 2

    sget-object v0, LYue/ۥۡۡۤۨ;->ۥ۟:LYue/ۥۡۡۤۨ;

    invoke-virtual {v0}, LYue/ۥۡۡۤۨ;->ۥ۟۟۟۟()J

    move-result-wide v0

    return-wide v0
.end method
