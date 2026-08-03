.class public final Lm0/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final e:Lx0/a;


# instance fields
.field public final a:Lx0/c;

.field public final b:Lx0/c;

.field public final c:Lx0/c;

.field public final d:Lx0/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lx0/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lx0/a;-><init>(F)V

    sput-object v0, Lm0/e;->e:Lx0/a;

    return-void
.end method

.method public constructor <init>(Lx0/c;Lx0/c;Lx0/c;Lx0/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm0/e;->a:Lx0/c;

    iput-object p3, p0, Lm0/e;->b:Lx0/c;

    iput-object p4, p0, Lm0/e;->c:Lx0/c;

    iput-object p2, p0, Lm0/e;->d:Lx0/c;

    return-void
.end method
