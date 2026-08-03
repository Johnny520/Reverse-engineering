.class public final LYue/ۥۡۨۨۤ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۨۨۤ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۡۨۨۤ$ۥ$ۥ;
    }
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field public static ۥ۟:LYue/ۥۡۨۨۤ$ۥ;


# instance fields
.field public final ۥ:LYue/ۥۡۨۨۤ$ۥ$ۥ;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LYue/ۥۡۨۨۤ$ۥ$ۥ;

    invoke-direct {v0}, LYue/ۥۡۨۨۤ$ۥ$ۥ;-><init>()V

    iput-object v0, p0, LYue/ۥۡۨۨۤ$ۥ;->ۥ:LYue/ۥۡۨۨۤ$ۥ$ۥ;

    return-void
.end method

.method public static ۥ۟()LYue/ۥۡۨۨۤ$ۥ;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    sget-object v0, LYue/ۥۡۨۨۤ$ۥ;->ۥ۟:LYue/ۥۡۨۨۤ$ۥ;

    if-nez v0, :cond_0

    new-instance v0, LYue/ۥۡۨۨۤ$ۥ;

    invoke-direct {v0}, LYue/ۥۡۨۨۤ$ۥ;-><init>()V

    sput-object v0, LYue/ۥۡۨۨۤ$ۥ;->ۥ۟:LYue/ۥۡۨۨۤ$ۥ;

    :cond_0
    sget-object v0, LYue/ۥۡۨۨۤ$ۥ;->ۥ۟:LYue/ۥۡۨۨۤ$ۥ;

    return-object v0
.end method


# virtual methods
.method public ۥ(Landroid/content/SharedPreferences$Editor;)V
    .locals 1
    .param p1    # Landroid/content/SharedPreferences$Editor;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۨۨۤ$ۥ;->ۥ:LYue/ۥۡۨۨۤ$ۥ$ۥ;

    invoke-virtual {v0, p1}, LYue/ۥۡۨۨۤ$ۥ$ۥ;->ۥ(Landroid/content/SharedPreferences$Editor;)V

    return-void
.end method
