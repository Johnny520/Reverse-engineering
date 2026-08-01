.class public final synthetic La20;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:Landroid/app/Activity;

.field public final synthetic ζ:J

.field public final synthetic η:Z


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;JZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La20;->ε:Landroid/app/Activity;

    .line 5
    .line 6
    iput-wide p2, p0, La20;->ζ:J

    .line 7
    .line 8
    iput-boolean p4, p0, La20;->η:Z

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    sget-object v0, Lcom/example/dyhelper/hook/γ;->α:Lcom/example/dyhelper/hook/γ;

    .line 2
    .line 3
    iget-object v0, p0, La20;->ε:Landroid/app/Activity;

    .line 4
    .line 5
    iget-wide v1, p0, La20;->ζ:J

    .line 6
    .line 7
    iget-boolean p0, p0, La20;->η:Z

    .line 8
    .line 9
    invoke-static {v0, v1, v2, p0}, Lcom/example/dyhelper/hook/γ;->в(Landroid/app/Activity;JZ)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
