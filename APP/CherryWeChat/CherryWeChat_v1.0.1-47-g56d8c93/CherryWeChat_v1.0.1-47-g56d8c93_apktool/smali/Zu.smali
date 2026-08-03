.class public abstract LZu;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:LYu;

.field public static final b:LC;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LYu;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, LZu;->a:LYu;

    sget-object v0, LYl;->a:Ljava/lang/Integer;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ldh;

    invoke-direct {v0}, Ldh;-><init>()V

    goto :goto_1

    :cond_1
    :goto_0
    new-instance v0, LQt;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    :goto_1
    sput-object v0, LZu;->b:LC;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
