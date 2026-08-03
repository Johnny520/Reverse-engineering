.class public LYue/ۥ۟ۨۢۨ;
.super Ljava/net/Socket;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۟ۨۢۨ$ۥ;
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/net/DatagramSocket;Ljava/io/FileDescriptor;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/SocketException;
        }
    .end annotation

    new-instance v0, LYue/ۥ۟ۨۢۨ$ۥ;

    invoke-direct {v0, p1, p2}, LYue/ۥ۟ۨۢۨ$ۥ;-><init>(Ljava/net/DatagramSocket;Ljava/io/FileDescriptor;)V

    invoke-direct {p0, v0}, Ljava/net/Socket;-><init>(Ljava/net/SocketImpl;)V

    return-void
.end method
