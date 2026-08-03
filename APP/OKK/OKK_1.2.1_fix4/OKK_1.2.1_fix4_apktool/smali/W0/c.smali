.class public final LW0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV0/h;


# instance fields
.field public final a:Ljava/lang/CharSequence;

.field public final b:I

.field public final c:I

.field public final d:LP0/p;


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;IILP0/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LW0/c;->a:Ljava/lang/CharSequence;

    iput p2, p0, LW0/c;->b:I

    iput p3, p0, LW0/c;->c:I

    iput-object p4, p0, LW0/c;->d:LP0/p;

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    new-instance v0, LW0/b;

    invoke-direct {v0, p0}, LW0/b;-><init>(LW0/c;)V

    return-object v0
.end method
