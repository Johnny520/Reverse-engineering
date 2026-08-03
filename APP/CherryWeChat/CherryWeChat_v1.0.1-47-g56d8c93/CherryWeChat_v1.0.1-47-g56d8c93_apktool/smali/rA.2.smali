.class public abstract LrA;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:LY5;

.field public static final b:LY5;

.field public static final c:LY5;

.field public static final d:LY5;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LY5;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LY5;-><init>(Lgf;Z)V

    sput-object v0, LrA;->a:LY5;

    new-instance v0, LY5;

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, LY5;-><init>(Lgf;Z)V

    sput-object v0, LrA;->b:LY5;

    new-instance v0, LY5;

    sget-object v1, Lgf;->i:Lgf;

    invoke-direct {v0, v1, v2}, LY5;-><init>(Lgf;Z)V

    sput-object v0, LrA;->c:LY5;

    new-instance v0, LY5;

    invoke-direct {v0, v1, v3}, LY5;-><init>(Lgf;Z)V

    sput-object v0, LrA;->d:LY5;

    return-void
.end method
