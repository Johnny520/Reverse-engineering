.class public final LU/Y;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:LC/b;


# instance fields
.field public a:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LC/b;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, LC/b;-><init>(I)V

    sput-object v0, LU/Y;->b:LC/b;

    return-void
.end method

.method public static a()LU/Y;
    .locals 1

    sget-object v0, LU/Y;->b:LC/b;

    invoke-virtual {v0}, LC/b;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LU/Y;

    if-nez v0, :cond_0

    new-instance v0, LU/Y;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    :cond_0
    return-object v0
.end method
