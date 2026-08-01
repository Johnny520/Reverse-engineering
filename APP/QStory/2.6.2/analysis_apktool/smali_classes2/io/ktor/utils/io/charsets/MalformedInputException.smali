.class public Lio/ktor/utils/io/charsets/MalformedInputException;
.super Ljava/nio/charset/MalformedInputException;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0008\u0008\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0007R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lio/ktor/utils/io/charsets/MalformedInputException;",
        "Ljava/nio/charset/MalformedInputException;",
        "",
        "message",
        "<init>",
        "(Ljava/lang/String;)V",
        "_message",
        "Ljava/lang/String;",
        "getMessage",
        "()Ljava/lang/String;",
        "ktor-io"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final _message:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-direct {p0, v0}, Ljava/nio/charset/MalformedInputException;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lio/ktor/utils/io/charsets/MalformedInputException;->_message:Ljava/lang/String;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public getMessage()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/ktor/utils/io/charsets/MalformedInputException;->_message:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
