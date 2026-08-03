.class public La/r1$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/r1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/r1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final synthetic a:La/r1;


# direct methods
.method public constructor <init>(La/r1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/r1$b;->a:La/r1;

    return-void
.end method


# virtual methods
.method public c(IF)V
    .locals 0

    return-void
.end method
