.class public final Lyz0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lj40;


# instance fields
.field public final a:Ltd1;


# direct methods
.method public constructor <init>(Ltd1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyz0;->a:Ltd1;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Class;
    .locals 0

    .line 1
    const-class p0, Ljava/io/InputStream;

    .line 2
    .line 3
    return-object p0
.end method

.method public final b(Ljava/lang/Object;)Lk40;
    .locals 1

    .line 1
    check-cast p1, Ljava/io/InputStream;

    .line 2
    .line 3
    new-instance v0, Ln4;

    .line 4
    .line 5
    iget-object p0, p0, Lyz0;->a:Ltd1;

    .line 6
    .line 7
    invoke-direct {v0, p1, p0}, Ln4;-><init>(Ljava/io/InputStream;Ltd1;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method
