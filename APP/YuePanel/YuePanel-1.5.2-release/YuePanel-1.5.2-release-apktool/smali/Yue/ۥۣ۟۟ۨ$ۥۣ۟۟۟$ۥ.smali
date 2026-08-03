.class public final LYue/ۥۣ۟۟ۨ$ۥۣ۟۟۟$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۣ۟۟ۨ$ۥۣ۟۟۟;
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
    invoke-direct {p0}, LYue/ۥۣ۟۟ۨ$ۥۣ۟۟۟$ۥ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ()I
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi",
            "ClassVerificationFailure"
        }
    .end annotation

    sget-object v0, LYue/ۥۣ۟۟ۨ$ۥ۟۟۟ۤ;->ۥ:LYue/ۥۣ۟۟ۨ$ۥ۟۟۟ۤ$ۥ;

    invoke-virtual {v0}, LYue/ۥۣ۟۟ۨ$ۥ۟۟۟ۤ$ۥ;->ۥ۟۟۟ۤ()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, LYue/ۥ۟۟ۨۤ;->ۥ()I

    move-result v0

    goto :goto_0

    :cond_0
    const v0, 0x7fffffff

    :goto_0
    return v0
.end method
