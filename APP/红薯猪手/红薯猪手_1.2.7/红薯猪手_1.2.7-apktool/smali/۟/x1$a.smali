.class public final L۟/x1$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = L۟/x1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final ۥ:Ljava/io/InputStream;

.field public final ۥ۟:Z

.field public final ۥ۟۟:J


# direct methods
.method public constructor <init>(Ljava/io/InputStream;ZJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    iput-object p1, p0, L۟/x1$a;->ۥ:Ljava/io/InputStream;

    iput-boolean p2, p0, L۟/x1$a;->ۥ۟:Z

    iput-wide p3, p0, L۟/x1$a;->ۥ۟۟:J

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Stream may not be null."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
