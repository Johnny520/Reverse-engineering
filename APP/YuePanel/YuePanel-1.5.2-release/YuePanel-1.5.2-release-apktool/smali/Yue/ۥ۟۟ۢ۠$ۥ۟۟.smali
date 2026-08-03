.class public final LYue/ۥ۟۟ۢ۠$ۥ۟۟;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟۟ۢ۠;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5\u06df\u06df"
.end annotation


# static fields
.field public static final ۥ۟۟:LYue/ۥ۟۟ۢ۠$ۥ۟۟;

.field public static final ۥ۟۟۟:LYue/ۥ۟۟ۢ۠$ۥ۟۟;


# instance fields
.field public final ۥ:Z

.field public final ۥ۟:Ljava/lang/Throwable;
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-boolean v0, LYue/ۥ۟۟ۢ۠;->ۥ۟۟۠ۦ:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    sput-object v1, LYue/ۥ۟۟ۢ۠$ۥ۟۟;->ۥ۟۟۟:LYue/ۥ۟۟ۢ۠$ۥ۟۟;

    sput-object v1, LYue/ۥ۟۟ۢ۠$ۥ۟۟;->ۥ۟۟:LYue/ۥ۟۟ۢ۠$ۥ۟۟;

    goto :goto_0

    :cond_0
    new-instance v0, LYue/ۥ۟۟ۢ۠$ۥ۟۟;

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1}, LYue/ۥ۟۟ۢ۠$ۥ۟۟;-><init>(ZLjava/lang/Throwable;)V

    sput-object v0, LYue/ۥ۟۟ۢ۠$ۥ۟۟;->ۥ۟۟۟:LYue/ۥ۟۟ۢ۠$ۥ۟۟;

    new-instance v0, LYue/ۥ۟۟ۢ۠$ۥ۟۟;

    const/4 v2, 0x1

    invoke-direct {v0, v2, v1}, LYue/ۥ۟۟ۢ۠$ۥ۟۟;-><init>(ZLjava/lang/Throwable;)V

    sput-object v0, LYue/ۥ۟۟ۢ۠$ۥ۟۟;->ۥ۟۟:LYue/ۥ۟۟ۢ۠$ۥ۟۟;

    :goto_0
    return-void
.end method

.method public constructor <init>(ZLjava/lang/Throwable;)V
    .locals 0
    .param p2    # Ljava/lang/Throwable;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LYue/ۥ۟۟ۢ۠$ۥ۟۟;->ۥ:Z

    iput-object p2, p0, LYue/ۥ۟۟ۢ۠$ۥ۟۟;->ۥ۟:Ljava/lang/Throwable;

    return-void
.end method
