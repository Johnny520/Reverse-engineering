.class public final La/Xe$c;
.super La/Xe$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/Xe;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field public final b:Z


# direct methods
.method public constructor <init>(La/Xe$a;Z)V
    .locals 0

    invoke-direct {p0, p1}, La/Xe$b;-><init>(La/Xe$a;)V

    iput-boolean p2, p0, La/Xe$c;->b:Z

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-boolean v0, p0, La/Xe$c;->b:Z

    return v0
.end method
