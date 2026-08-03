.class public final LF;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final b:LF;

.field public static final c:LF;


# instance fields
.field public final a:Ljava/lang/Throwable;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-boolean v0, LL;->d:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    sput-object v1, LF;->c:LF;

    sput-object v1, LF;->b:LF;

    return-void

    :cond_0
    new-instance v0, LF;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LF;-><init>(Ljava/lang/Throwable;Z)V

    sput-object v0, LF;->c:LF;

    new-instance v0, LF;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LF;-><init>(Ljava/lang/Throwable;Z)V

    sput-object v0, LF;->b:LF;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Throwable;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF;->a:Ljava/lang/Throwable;

    return-void
.end method
