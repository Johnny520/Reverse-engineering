.class public final L۟/x1$b;
.super Ljava/io/IOException;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = L۟/x1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final ۥ:Z

.field public final ۥ۟:I


# direct methods
.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-static {p2}, L۟/c4;->ۥ(I)Z

    move-result p1

    iput-boolean p1, p0, L۟/x1$b;->ۥ:Z

    iput p3, p0, L۟/x1$b;->ۥ۟:I

    return-void
.end method
