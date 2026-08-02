.class public final Lzb2;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lth0;


# instance fields
.field public final h:Ljava/security/MessageDigest;

.field public final i:Lsu2;


# direct methods
.method public constructor <init>(Ljava/security/MessageDigest;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lsu2;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lzb2;->i:Lsu2;

    .line 10
    .line 11
    iput-object p1, p0, Lzb2;->h:Ljava/security/MessageDigest;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final c()Lsu2;
    .locals 0

    .line 1
    iget-object p0, p0, Lzb2;->i:Lsu2;

    .line 2
    .line 3
    return-object p0
.end method
