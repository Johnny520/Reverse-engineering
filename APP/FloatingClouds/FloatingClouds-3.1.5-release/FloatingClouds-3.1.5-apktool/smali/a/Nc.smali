.class public abstract La/Nc;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/Nc$a;
    }
.end annotation


# static fields
.field public static final a:La/Nc$a;

.field public static final b:La/y;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, La/Nc$a;

    invoke-direct {v0}, La/Nc;-><init>()V

    sput-object v0, La/Nc;->a:La/Nc$a;

    sget-object v0, La/wc;->a:La/m9;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, La/m9$a;->a:Ljava/lang/Integer;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, La/k6;

    invoke-direct {v0}, La/k6;-><init>()V

    goto :goto_1

    :cond_1
    :goto_0
    new-instance v0, La/xc;

    invoke-direct {v0}, La/Nc;-><init>()V

    :goto_1
    sput-object v0, La/Nc;->b:La/y;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
