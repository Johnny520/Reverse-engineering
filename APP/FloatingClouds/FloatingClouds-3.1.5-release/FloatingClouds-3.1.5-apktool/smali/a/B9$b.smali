.class public final La/B9$b;
.super La/K1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/B9;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# direct methods
.method public constructor <init>(La/A2;)V
    .locals 1

    invoke-direct {p0}, La/K1;-><init>()V

    new-instance v0, La/me;

    invoke-direct {v0, p0, p1}, La/me;-><init>(La/B9$b;La/A2;)V

    iput-object v0, p0, La/K1;->d:La/K1$a;

    return-void
.end method
