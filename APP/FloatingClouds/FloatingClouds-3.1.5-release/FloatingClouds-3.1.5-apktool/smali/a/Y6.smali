.class public final La/Y6;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/X6$a;


# direct methods
.method public constructor <init>(La/X6$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/Y6;->a:La/X6$a;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, La/Y6;->a:La/X6$a;

    iget-object v0, v0, La/Z6;->d:La/i7;

    invoke-virtual {v0}, La/e7;->P()V

    return-void
.end method
