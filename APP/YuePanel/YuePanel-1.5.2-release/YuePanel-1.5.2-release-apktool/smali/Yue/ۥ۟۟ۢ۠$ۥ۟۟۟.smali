.class public final LYue/ۥ۟۟ۢ۠$ۥ۟۟۟;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟۟ۢ۠;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5\u06df\u06df\u06df"
.end annotation


# static fields
.field public static final ۥ۟:LYue/ۥ۟۟ۢ۠$ۥ۟۟۟;


# instance fields
.field public final ۥ:Ljava/lang/Throwable;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LYue/ۥ۟۟ۢ۠$ۥ۟۟۟;

    new-instance v1, LYue/ۥ۟۟ۢ۠$ۥ۟۟۟$ۥ;

    const-string v2, "Failure occurred while trying to finish a future."

    invoke-direct {v1, v2}, LYue/ۥ۟۟ۢ۠$ۥ۟۟۟$ۥ;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, LYue/ۥ۟۟ۢ۠$ۥ۟۟۟;-><init>(Ljava/lang/Throwable;)V

    sput-object v0, LYue/ۥ۟۟ۢ۠$ۥ۟۟۟;->ۥ۟:LYue/ۥ۟۟ۢ۠$ۥ۟۟۟;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LYue/ۥ۟۟ۢ۠;->ۥ۟۟۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Throwable;

    iput-object p1, p0, LYue/ۥ۟۟ۢ۠$ۥ۟۟۟;->ۥ:Ljava/lang/Throwable;

    return-void
.end method
